public class LibraryTestClient {

    public static void main(String[] args)
    {
        //This database is strictly for checking the status of items in the library. A proper secure inventory system is
        //recommended

        //Creates new objects.
        Video theMartian = new Video(1, "The Martian", "SciFi", "1:00:00");
        JournalArticles natGeo = new JournalArticles(2, "National Geographic Journals",
                "National Geographic", "01/27/2018", "A writer", "Nature");
        CD mixTape = new CD(3, "Da Mixtape", "Trash", "00:02:58");
        Book lOTR = new Book(4, "Lord of the Rings", "Fantasy", "J. R. R. Tolkien", 479);
        Magazines dramaNow = new Magazines(5, "Drama Now", "07/23/1006", "Volume 4", "Trash");

        //Calls for the current status and information about the item
        theMartian.info();
        //Call to checkout the item
        theMartian.checkOut(3247987);
        theMartian.info();
        //Call to return the item
        theMartian.checkIn();
        theMartian.info();
        //Call to gain the barcode number of the item
        System.out.println("The barcode is : " + theMartian.getBarCode());
        //Call to gain the current userID attached to the item. This does not determine whether the item is checked in
        //or not
        System.out.println("The user attached is: " + theMartian.getUserID());
        //Call to return whether the item is checked in
        System.out.println("Checkout Status: " + theMartian.getCheckedOutStatus());

        //The same should work with other object types that inherent LibraryItem

        System.out.println();
        natGeo.info();
        natGeo.checkOut(2893840);
        natGeo.info();
        natGeo.checkIn();
        natGeo.info();
        System.out.println();

        System.out.println();
        mixTape.info();
        mixTape.checkOut(2893840);
        mixTape.info();
        mixTape.checkIn();
        mixTape.info();
        System.out.println();

        System.out.println();
        lOTR.info();
        lOTR.checkOut(2893840);
        lOTR.info();
        lOTR.checkIn();
        lOTR.info();
        System.out.println();

        System.out.println();
        dramaNow.info();
        dramaNow.checkOut(2893840);
        dramaNow.info();
        dramaNow.checkIn();
        dramaNow.info();
        System.out.println();

    }

}
