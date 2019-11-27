import java.text.DecimalFormat;

public class ShopperClient {
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("#.##");

        //Add items
        GroceryItemOrder lettuce = new GroceryItemOrder("lettuce", 1, 3.75);
        GroceryItemOrder tomato = new GroceryItemOrder("tomato", 1, 2.50);
        GroceryItemOrder eggs = new GroceryItemOrder("eggs", 12, 2.00);
        GroceryItemOrder milk = new GroceryItemOrder("milk", 1, 3.25);
        GroceryItemOrder donuts = new GroceryItemOrder("donuts", 6, 4.00);
        GroceryItemOrder water = new GroceryItemOrder("water", 24, 0.75);
        GroceryItemOrder strawberries = new GroceryItemOrder("strawberries", 20, 3.65);
        GroceryItemOrder GTX2080TI = new GroceryItemOrder("GTX2080TI", 1, 1249.99);
        GroceryItemOrder Controller = new GroceryItemOrder("Controller", 1, 40);

        //Create shopping list
        GroceryList list = new GroceryList();

        //Add items to list
        list.add(lettuce);
        list.add(tomato);
        list.add(eggs);
        list.add(milk);
        list.add(donuts);
        list.add(water);
        list.add(strawberries);
        list.add(GTX2080TI);
        list.add(Controller);

        double tax = list.totalPrice * 0.1;
        list.totalPrice = list.totalPrice + tax;

        System.out.println("Tax (10%): $" + money.format(tax));
        System.out.println("Grand Total: $" + money.format(list.totalPrice));


    }

}
