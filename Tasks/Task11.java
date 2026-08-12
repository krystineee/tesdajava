class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Title: \"" + title + "\""
            + "\nAuthor: \"" + author + "\""
            + "\nYear Published: " + yearPublished
            + "\nPrice: $" + price;
    }
   
}

public class Task11 {
    public static void main(String[] args) {
        Book[] books = new Book[] {
        new Book("Java Programming", "John Smith", 2021, 39.99),
        new Book("Python Basics", "Jane Doe", 2020, 29.99),
        new Book("C++ Essentials", "Michael Johnson", 2019, 49.99),
        };
        int bookNumber = 1;
        for (Book b : books) {
            System.out.println("Book " + bookNumber + ":");
            System.out.println(b);
            System.out.println();
            bookNumber++;
        }
    }
}