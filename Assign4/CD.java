public class CD extends LibraryItem {

    private String genre;
    private String length;


    public CD(int barCode, String name, String genre, String length) {
        super(barCode, name);
        this.genre = genre;
        this.length = length;

    }
    public void info()
    {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + genre);
        System.out.println("Length: " + length);
        getCheckOut();
        System.out.println();
    }
}
