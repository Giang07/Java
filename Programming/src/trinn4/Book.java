package trinn4;

import java.net.SocketOption;
import java.util.ArrayList;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private ArrayList<Chapter> chapters;
    private int minutesPerPage;

    public Book(String isbn, String title, String author,
                int numberOfPages, Genre genre, ArrayList<Chapter> chapters, int minutesPerPage) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.chapters = chapters;
        this.minutesPerPage = minutesPerPage;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }


    public void printState() {
        System.out.println("ISBN: " + isbn + ", Title: "+ title + ", Author: " + author +
                ", NrOfPages: " +numberOfPages + ".");

        System.out.println("--------------------------------");
        System.out.println(" Chapter Information: ");
        for (Chapter c : chapters) {
            c.printChapterInformation();
        }

        System.out.println("**********************************");
    }

    public int getReadingTimes() {
        return minutesPerPage * numberOfPages;
    }

    public static void main(String[] args) {

    }
}
