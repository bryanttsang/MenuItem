public class Sandwich
{
    private String sandwich;
    private double price;

    public Sandwich(double price, String sandwich)
    {
        this.price = price;
        this.sandwich = sandwich;
    }

    public String getName()
    {
        return this.sandwich;
    }

    public double getPrice()
    {
        return this.price;
    }
}
