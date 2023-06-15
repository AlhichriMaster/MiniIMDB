import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class userList {
    private static List<User> users;

    public userList() {
        users = readUserCSV("usersAndPasswords.csv");
    }


    public static List<User> readUserCSV(String filePath) {

        String line;
        String csvSplitBy = ",";
        List<User> Users = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if(!data[0].equals("name")){
                    User newUser = new User(data[0], Integer.parseInt(data[1]), data[2], data[3]);
                    Users.add(newUser);
                }else{
                    continue;
                }         
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Users;
    }


    public List<User> getUsers(){return users;}
}

