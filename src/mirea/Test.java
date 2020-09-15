package mirea;

public class Test {
    public static void main(String[] args){

        Plate a = new Plate(25,"white",3);
        Glass b = new Glass(10,"yellow",1);
        Pan c = new Pan(2000,"grey",25);

        a.SetColor("black");
        b.SetPrice(1.25);

        a.SFall();
        b.SFall();
        c.SFall();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
