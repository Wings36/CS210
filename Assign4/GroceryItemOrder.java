class GroceryItemOrder {
    String name;
    private int quantity;
    private double pricePerUnit;

    GroceryItemOrder(String name, double pricePerUnit)
    {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    double getCost()
    {
        return pricePerUnit * quantity;
    }

    void setQuantity(int quantity, GroceryList list)
    {
        this.quantity = quantity;
        list.update(name, this);
    }




}
