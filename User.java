// import Movie;
// import Rating;
import java.util.ArrayList;
import java.util.List;


public class User{
    private String name;
    private int age;
    // private String gender;
    private String email;
    private String password;
    private List<Movie> watchlist;
    private List<Rating> ratings;

    public User(String name, int age, String gender, String email, String password) {
        this.name = name;
        this.age = age;
        // this.gender = gender;
        this.email = email;
        this.password = password;
        this.watchlist = new ArrayList<Movie>();
        this.ratings = new ArrayList<Rating>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public String getGender() {
    //     return gender;
    // }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Movie> getWatchlist() {
        return watchlist;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void addToWatchlist(Movie movie) {
        watchlist.add(movie);
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }




    // public static void main(String[] args){
    //     System.out.print("Compiled");
    // }

}