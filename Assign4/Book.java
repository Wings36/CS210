public class Book extends LibraryItem {

    private String genre;
    private int pageCount;
    private String author;

    public Book(int barCode, String name, String genre, String author, int pageCount) {
        super(barCode, name);
        this.genre = genre;
        this.pageCount = pageCount;
        this.author = author;
    }
    public void info()
    {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount);
        getCheckOut();
        System.out.println();
    }
}
