import java.util.*;


final class Book {
    private String title;
    private int pageCount;
    private String author;
    private int publicationYear;

    // Constructor
    public Book(String title, int pageCount, String author, int publicationYear) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // compareTo metodu, isme göre sıralama yapıyor (A'dan Z'ye)
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // toString metodu, kitabın bilgilerini döndürüyor
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

}
