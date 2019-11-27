import java.text.DecimalFormat;
import java.util.ArrayList;

class GroceryList {

    private DecimalFormat money = new DecimalFormat("#.##");
    private ArrayList<String> itemList;
    private ArrayList<Double> itemCost;


    GroceryList()
    {
        itemList = new ArrayList<>();
        itemCost = new ArrayList<>();
    }

    void add(GroceryItemOrder item) {


        if (itemList.size() < 10) {
            itemList.add(item.name);
            itemCost.add(item.getCost());

            System.out.println();
            System.out.println(item.name + " cost: $" + money.format(item.getCost()) + " Total: $" + money.format(total()));
            if (itemList.size() == 8) {
                System.out.println("Warning: The cart can only hold 10 items. Current: 9");
            }
        }
    }

    private double total() {
        return itemCost.stream().mapToDouble(n -> n).sum();
    }

    void update(String name, GroceryItemOrder item)
    {
        if(itemList.contains(name))
        {
            int index = itemList.indexOf(name);
            itemCost.set(index, item.getCost());

        }
    }
    double tax()
    {
        double tax = total() * 0.1;
        System.out.println("Tax (10%): $" + money.format(tax));
        return total() + tax;
    }

}
