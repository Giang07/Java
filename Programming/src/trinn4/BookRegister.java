package trinn4;

import java.util.ArrayList;

public class BookRegister {
    private ArrayList<Book> books;


    public BookRegister() {
        books = new ArrayList<>();

        ArrayList<Chapter> hpChapters = new ArrayList<>();

        hpChapters.add(new Chapter("Chapter 1", 56));
        hpChapters.add(new Chapter("Chapter 2", 47));
        hpChapters.add(new Chapter("Chapter 3", 76));

        Book book1 = new Book("1243", "Harry Potter", "R.Ling",
                134, Genre.FANTASY, hpChapters, 12);
        books.add(book1);


        ArrayList<Chapter> sulChapters = new ArrayList<>();

        sulChapters.add(new Chapter("Chapter 1", 46));
        sulChapters.add(new Chapter("Chapter 2", 17));
        sulChapters.add(new Chapter("Chapter 3", 56));

        Book book2 = new Book("5643", "Sul", "Hamsen",
                354, Genre.CLASSIC, sulChapters, 42);
        books.add(book2);
    }

    public void addBook(Book b) {
        books.add(b);
    }
    public void printBooksByGenre(Genre genre) {
        for (int i = 0; i < books.size(); i ++) {
            Book b = books.get(i);
            if (b.getGenre() == genre) {
                b.printState();
            }
        }
    }

    public void printAllBooks() {
        for (Book b : books) {
            b.printState();
        }
    }

    public void printBooksByAuthor(String author) {
        for (int i = 0; i < books.size(); i ++) {
            Book b = books.get(i);
            if (b.getAuthor() == author) {
                b.printState();
            }
        }
    }

    public void printBooksByMaxReadingTime(int max) {
        for (Book b : books) {
            if (b.getReadingTimes() <= max) {
                b.printState();
            }
        }
    }

    public void removeBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                books.remove(b);
                break;
            }
        }
    }

}
