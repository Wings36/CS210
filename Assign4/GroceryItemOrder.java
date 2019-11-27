public class GroceryItemOrder {
    String name;
    int quantity;
    double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost()
    {
        return pricePerUnit * quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }




}
