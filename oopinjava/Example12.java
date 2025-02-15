package oopinjava;

class MyMovie {
    String title;
    String genre;
    int duration;
    double rating;

    public MyMovie() {
        System.out.println("dummy constructor\n");
    }

    public MyMovie(String title, String genre, int duration, double rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MyMovie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}


public class Example12 {
    public static void main(String[] args) {

        MyMovie movie1 = new MyMovie();
        System.out.println("\nDefault movie details:\n" + movie1);

        // Setting values using setters
        movie1.setTitle("Inception");
        movie1.setGenre("Sci-Fi");
        movie1.setDuration(148); // in minutes
        movie1.setRating(8.8);

        System.out.println("\nAfter setting values for movie1 using setters:");
        System.out.println(movie1);
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Genre: " + movie1.getGenre());
        System.out.println("Duration: " + movie1.getDuration() + " minutes");
        System.out.println("Rating: " + movie1.getRating());

        // Using all-argument constructor
        MyMovie movie2 = new MyMovie("The Shawshank Redemption", "Drama", 142, 9.3);
        System.out.println("\nSetting values for movie2 using all-argument constructor:\n");
        System.out.println(movie2);
        System.out.println("Title: " + movie2.getTitle());
        System.out.println("Genre: " + movie2.getGenre());
        System.out.println("Duration: " + movie2.getDuration() + " minutes");
        System.out.println("Rating: " + movie2.getRating());
    }
}

