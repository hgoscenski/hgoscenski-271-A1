/**
 * Created by hgoscenski on 1/17/17.
 */

public class Book {
    private String title;
    private String author;
    private int pubYear;
    private int numPages;

    public Book(String title, String author, int pubYear, int numPages){
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.numPages = numPages;
    }

    public int getPages() {
        return numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return
                title + " by " +
                author + " published in " +
                pubYear + " with " +
                numPages + " pages.";
    }

    public void updateBook(int newPubYear, int newNumPages){
        pubYear = newPubYear;
        numPages = newNumPages;
    }

}
