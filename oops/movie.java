package oops;

public class movie {
    String title;
    String director;
    int releaseYear;
    public movie(String t,String d,int r)
    {
        this.title=t;
        this.director=d;
        this.releaseYear=r;
    }
    public void displayMovieDetails()
    {
        System.out.println("movie title: "+title);
        System.out.println("movie director: "+director);
        System.out.println("movie release year: "+releaseYear);
    }
    public static void main(String[] args) {
        movie m = new movie("harry potter","jk rowling",2010);
        m.displayMovieDetails();
    }
}
