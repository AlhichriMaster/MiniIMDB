import java.util.Date;


public class Rating {
    private int ratingID;
    private int movieID;
    private int userID;
    private double ratingScore;
    private Date date;
    private String comments;

    public Rating(int ratingID, int movieID, int userID, double ratingScore, Date date, String comments) {
        this.ratingID = ratingID;
        this.movieID = movieID;
        this.userID = userID;
        this.ratingScore = ratingScore;
        this.date = date;
        this.comments = comments;
    }

    public int getRatingID() {
        return ratingID;
    }

    public int getMovieID() {
        return movieID;
    }

    public int getUserID() {
        return userID;
    }

    public double getRatingScore() {
        return ratingScore;
    }

    public Date getDate() {
        return date;
    }

    public String getComments() {
        return comments;
    }


    // public static void main(String[] args){
    //     System.out.print("Compiled");
    // }
}