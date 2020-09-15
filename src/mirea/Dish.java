package mirea;

public abstract class Dish
{
    protected double price;
    protected String color;
    protected String fall;

    public abstract void SFall();

    public void SetColor(String color)
    {
        this.color = color;

    }
    public void SetPrice( double price)
    {
        this.price = price;
    }
}
 