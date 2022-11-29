import java.util.Scanner;

public class Movie {
    private String language;

    static Scanner scanner = new Scanner(System.in);

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String addMovie(String language){
        System.out.println("Enter the name of the movie to be added : ");
        String addedMovie = scanner.nextLine().toLowerCase();
        this.language = language;

        return addedMovie;
    }

    public int removeMovie(String language){
        this.language = language;
        System.out.println("Enter the movie number to remove it");
        int movieNumber = Integer.parseInt(scanner.nextLine());
        return movieNumber;

    }


}
