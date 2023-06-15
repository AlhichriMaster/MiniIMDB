import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieName;
    private String genre;
    private int releaseYear;
    private double rating;

    public Movie(String movieName, String genre, int releaseYear, double rating) {
        this.movieName = movieName;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    // toString() method
    @Override
    public String toString() {
        return "Movie Name: " + movieName + "\n" +
                "Genre: " + genre + "\n" +
                "Release Year: " + releaseYear + "\n" +
                "Rating: " + rating;
    }
    
}