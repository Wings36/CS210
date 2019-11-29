

public class LibraryItem {

    private int barCode;
    private boolean checkedOut;
    private int userID;
    private String title;

    public LibraryItem(int barCode, String name)
    {
        title = name;
        this.barCode = barCode;
        checkedOut = false;
    }

    public String getTitle()
    {
        return title;
    }

    public void getCheckOut()
    {
        if (checkedOut)
        {
            System.out.println("Checked out: True [User ID: " + userID + "]");
        }
        else
        {
            System.out.println("Checked out: False");
        }
    }

    public boolean getCheckedOutStatus()
    {
        return checkedOut;
    }

    public int getUserID()
    {
        return userID;
    }


    public int getBarCode()
    {
        return barCode;
    }

    public void checkOut(int userID)
    {
        checkedOut = true;
        this.userID = userID;
        System.out.println("Successfully Checked out " + title + " to user ID: " + userID);
    }
    public void checkIn()
    {
            checkedOut = false;
            System.out.println("Successfully Checked in " + title + " to user ID: " + userID);
    }
    //Default info
    public void info()
    {
        System.out.println();
        System.out.println("Title: " + getTitle());
        getCheckOut();
        System.out.println();
    }







}
