package trinn4;

public class Chapter {
    private String title;
    private int numberOfPages;

    public Chapter(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public void printChapterInformation() {
        System.out.println("Title: " + title + ", Pages: " + numberOfPages + ".");

    }
}
