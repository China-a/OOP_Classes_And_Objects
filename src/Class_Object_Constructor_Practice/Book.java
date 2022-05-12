package Class_Object_Constructor_Practice;

public class Book {
    private String bookTitle;
    private Integer numOfPagesInBook;
    private Integer publicationYear;

    public Book(Integer numOfPagesInBook, Integer publicationYear) {
        this.numOfPagesInBook = numOfPagesInBook;
        this.publicationYear = publicationYear;
    }
    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Integer getNumOfPagesInBook() {
        return numOfPagesInBook;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return getBookTitle() + " , " + getNumOfPagesInBook() + "  pages, " + getPublicationYear();
    }
}
