public class Drink
{
    private String drink;
    private double price;

    public Drink(double price, String drink)
    {
        this.price = price;
        this.drink = drink;
    }

    public String getName()
    {
        return this.drink;
    }

    public double getPrice()
    {
        return this.price;
    }
}
