import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class movieList {
    private static List<Movie> Movies;





    public movieList() {
        Movies = readMovieCSV("MovieData.csv");
    }


    public static List<Movie> readMovieCSV(String filePath) {
        String line;
        String csvSplitBy = ",";
        List<Movie> M = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if(!data[0].equals("MovieName")){
                    Movie movie = new Movie(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
                    M.add(movie);
                }else{
                    continue;
                }         
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return M;
    }


    public List<Movie> getMovies(){return Movies;}


}
