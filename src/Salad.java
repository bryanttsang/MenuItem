public class Salad
{
    private String salad;
    private double price;

    public Salad(double price, String salad)
    {
        this.price = price;
        this.salad = salad;
    }

    public String getName()
    {
        return this.salad;
    }

    public double getPrice()
    {
        return this.price;
    }
}
