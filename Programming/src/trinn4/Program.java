package trinn4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    BookRegister register;

    public Program() {
        register = new BookRegister();
        handleUserInteraction();
    }

    public void handleUserInteraction() {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        while (choice != 7) {
            System.out.println("1: Add book");
            System.out.println("2: All books");
            System.out.println("3: Books by Genre");
            System.out.println("4: Books by maximum reading time");
            System.out.println("5: Remove book");
            System.out.println("6: Books by author");
            System.out.println("7: Quit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 : {
                    addBook(input);
                    break;
                }
                case 2 : {
                    printAllBooks();
                    break;
                }
                case 3 : {
                    printBooksByAuthor(input);
                    break;
                }
                case 4 : {
                    getBookByMaxReadingTime(input);
                }
                case 5 : {
                    removeBooks(input);
                }
                case 6 : {
                    printBooksByAuthor(input);
                }
                case 7 : {
                    System.out.println("Thank you! BYE ");
                    break;
                }
                default: {
                    System.out.println("Your options are 1-6");
                }
            }

        }

    }

    public void addBook(Scanner input) {
        System.out.println("ISBN: ");
        String isbn = input.nextLine();
        input.nextLine();

        System.out.println("TITLE: ");
        String title = input.nextLine();
        input.nextLine();

        System.out.println("AUTHOR: ");
        String author = input.nextLine();
        input.nextLine();

        System.out.println("PAGES: ");
        int numberOfPages = input.nextInt();
        input.nextLine();

        System.out.println("GENRE: ");
        String genreText = input.nextLine().toUpperCase(Locale.ROOT);
        Genre genre = Genre.valueOf(genreText);
        input.nextLine();

        System.out.println("MinPerPages: ");
        int minutesPerPage = input.nextInt();
        input.nextLine();

        System.out.println("CHAPTERS: ");
        ArrayList<Chapter> chapters = new ArrayList<>();

        boolean moreChapters = true;
        while (moreChapters) {
            System.out.println("Chapter Title: ");
            String chapterTitle = input.nextLine();

            System.out.println("Chapter Nr of Pages: ");
            int chapterNrOfPages = input.nextInt();
            input.nextLine();

            chapters.add(new Chapter(chapterTitle, chapterNrOfPages));

            System.out.println("Are there more chapters? (y/n) ");
            moreChapters = input.nextLine().equalsIgnoreCase("y");
        }
        register.addBook(new Book(isbn, title, author, numberOfPages, genre, chapters, minutesPerPage));

    }

    public void printAllBooks() {
        register.printAllBooks();
    }


    public void printBooksByAuthor(Scanner input) {
        String author = input.nextLine();
        register.printBooksByAuthor(author);
    }

    public void printBooksByGenre(Scanner input) {
        System.out.println("Enter genre (CRIME, ACTION, FANTASY, CLASSIC or OTHER):");
        String genre = input.nextLine().toUpperCase();
        register.printBooksByGenre(Genre.valueOf(genre));
    }

    public void removeBooks(Scanner input) {
        String isbn = input.next();
        register.removeBook(isbn);
    }

    public void getBookByMaxReadingTime(Scanner input) {
        int max = input.nextInt();
        register.printBooksByMaxReadingTime(max);

    }
}
