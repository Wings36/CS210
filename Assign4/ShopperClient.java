import java.text.DecimalFormat;

public class ShopperClient {
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("#.##");

        //Add items
        GroceryItemOrder lettuce = new GroceryItemOrder("lettuce", 3.75);
        GroceryItemOrder tomato = new GroceryItemOrder("tomato", 2.50);
        GroceryItemOrder eggs = new GroceryItemOrder("eggs",  2.00);
        GroceryItemOrder milk = new GroceryItemOrder("milk",  3.25);
        GroceryItemOrder donuts = new GroceryItemOrder("donuts",  4.00);
        GroceryItemOrder water = new GroceryItemOrder("water",  0.75);
        GroceryItemOrder strawberries = new GroceryItemOrder("strawberries",  3.65);
        GroceryItemOrder gTX2018TI = new GroceryItemOrder("GTX2080TI",  1249.99);
        GroceryItemOrder controller = new GroceryItemOrder("Controller",  40);

        //Create shopping list
        GroceryList list = new GroceryList();

        //Add items to list
        lettuce.setQuantity(2, list);
        list.add(lettuce);
        tomato.setQuantity(4, list);
        list.add(tomato);
        eggs.setQuantity(12, list);
        list.add(eggs);
        milk.setQuantity(1, list);
        list.add(milk);
        donuts.setQuantity(6, list);
        list.add(donuts);
        water.setQuantity(32, list);
        list.add(water);
        strawberries.setQuantity(16, list);
        list.add(strawberries);
        gTX2018TI.setQuantity(1, list);
        list.add(gTX2018TI);
        controller.setQuantity(1, list);
        list.add(controller);


        System.out.println("Grand Total: $" + money.format(list.tax()));


    }

}
