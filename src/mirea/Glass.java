package mirea;

public class Glass extends Dish
{
    private int depth;

    public Glass(int depth, String color, double price)
    {
        this.depth = depth;
        this.color = color;
        this.price = price;
    }

    public void SFall()
    {
        System.out.println("Glass: Think");
    }
    public String toString()
    {
        return "GLASS: color: "+color+"; Depth = "+depth+"; Price: "+price+"$";
    }
}
