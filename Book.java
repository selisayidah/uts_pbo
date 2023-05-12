public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookInfo() {
        return "Judul: " + title + ", Penulis: " + author + ", Tahun: " + year;
    }

    public static void main(String[] args) {
        // Membuat objek Book dengan informasi buku
        Book book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);

        // Mendapatkan informasi buku menggunakan method getBookInfo
        String bookInfo = book.getBookInfo();
        System.out.println(bookInfo);
    }
}