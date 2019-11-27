import java.text.DecimalFormat;

public class GroceryList {

    DecimalFormat money = new DecimalFormat("#.##");

    public String itemList[];
    public double totalPrice;
    private int counter = 0;

    public GroceryList()
    {
        itemList = new String[10];
    }

    public void add (GroceryItemOrder item) {

        if (counter < 10) {
            itemList[counter] = item.name;
            totalPrice = totalPrice + item.getCost();
            System.out.println();
            System.out.println(item.name + " cost: $" + money.format(item.getCost()) + " Total: $" + money.format(totalPrice));
            if (counter == 8) {
                System.out.println("Warning: The cart can only hold 10 items. Current: 9");
            }
        }
    }

}
