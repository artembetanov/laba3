package mirea;

public class Plate extends Dish
{
    private int rad;

    public Plate(int rad, String color, double price)
    {
        this.rad = rad;
        this.color = color;
        this.price = price;
    }

    public void SFall()
    {
        System.out.println("Plate: Bdish");
    }
    public String toString()
    {
        return "PLATE: color: "+color+"; Rad = "+rad+"; Price: "+price+"$";
    }
}
