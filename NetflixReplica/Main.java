import java.io.* ;
// import java.util.BufferedReader;
import java.util.ArrayList;
import java.util.List;
// import Movie;
// import java.util.Arrays;

public class Main{


    public static void main(String[] args){

        movieList M = new movieList();

        for(Movie item : M.getMovies()){
            System.out.println(item.toString());
        }


        LoginGUI GUI = new LoginGUI();

        

        // GUI.createGUI();
    }

}

