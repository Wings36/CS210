public class Magazines extends LibraryItem {

    private String issueDate;
    private String series;
    private String genre;


    public Magazines(int barCode, String name, String issueDate, String series, String genre) {
        super(barCode, name);
        this.issueDate = issueDate;
        this.series = series;
        this.genre = genre;
    }

    public void info()
    {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Series: " + series);
        System.out.println("Issue Date: " + issueDate);
        getCheckOut();
        System.out.println();
    }
}
