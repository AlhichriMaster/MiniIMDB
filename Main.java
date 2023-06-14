import java.io.* ;
// import java.util.BufferedReader;
import java.util.ArrayList;
import java.util.List;
// import java.util.Arrays;

public class Main{



    public static List<Movie> readCSV(String filePath) {
        String line;
        String csvSplitBy = ",";
        List<Movie> Movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                //String movieName, String genre, int releaseYear, double rating
                //Movie Name,Genre,Release Year,Rating
                if(!data[0].equals("MovieName")){

                    // for(String item : data){
                    //     System.out.println(item);
                    // }

                    Movie movie = new Movie(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
                    Movies.add(movie);
                }else{
                    continue;
                }         
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // for(Movie item : Movies){
        //     System.out.println(item.toString());
        // }
        return Movies;
    }


    public static void main(String[] args){

        List<Movie> Movies = new ArrayList<>();
        
        Movies = readCSV("MovieData.csv");

        for(Movie item : Movies){
            System.out.println(item.toString());
        }
    }

}

