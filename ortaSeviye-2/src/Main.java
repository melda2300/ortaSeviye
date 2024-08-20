import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class main {
    public static void main(String[] args) {
        // 5 tane Book nesnesi oluşturuluyor
        Book book1 = new Book("A Tale of Two Cities", 489, "Charles Dickens", 1859);
        Book book2 = new Book("Pride and Prejudice", 279, "Jane Austen", 1813);
        Book book3 = new Book("The Hobbit", 310, "J.R.R. Tolkien", 1937);
        Book book4 = new Book("Moby Dick", 635, "Herman Melville", 1851);
        Book book5 = new Book("1984", 328, "George Orwell", 1949);

        // İlk Set yapısı: Kitapları isme göre sıralıyor (Comparable arayüzü ile)
        Set<Book> booksByTitle = new TreeSet<>();
        booksByTitle.add(book1);
        booksByTitle.add(book2);
        booksByTitle.add(book3);
        booksByTitle.add(book4);
        booksByTitle.add(book5);

        // Sonuçları yazdırma
        System.out.println("Books sorted by title:");
        for (Book book : booksByTitle) {
            System.out.println(book);
        }

        // İkinci Set yapısı: Kitapları sayfa sayısına göre sıralayan Comparator kullanılıyor
        TreeSet booksByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        booksByPageCount.add(book1);
        booksByPageCount.add(book2);
        booksByPageCount.add(book3);
        booksByPageCount.add(book4);
        booksByPageCount.add(book5);

        // Sonuçları yazdırma
        System.out.println("\nBooks sorted by page count:");
        for (Object book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
