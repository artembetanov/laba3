package mirea;

public class Pan extends Dish
{
    private int V;

    public Pan(int V, String color, double price)
    {
        this.V = V;
        this.color = color;
        this.price = price;
    }

    public void SFall()
    {
        System.out.println("Pan: Boung");
    }

    public String toString()
    {
        return "PAN: color: "+color+"; V = "+V+"; Price: "+price+"$";
    }
}
