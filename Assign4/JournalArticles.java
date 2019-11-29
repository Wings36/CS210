public class JournalArticles extends LibraryItem {

    private String publisher;
    private String date;
    private String author;
    private String subject;


    public JournalArticles(int barCode, String name, String publisher, String date, String author, String subject) {
        super(barCode, name);

        this.publisher = publisher;
        this.date = date;
        this.author = author;
        this.subject = subject;
    }

    public void info()
    {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Date: " + date);
        System.out.println("subject: " + subject);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
        getCheckOut();
        System.out.println();
    }
}
