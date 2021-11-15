class fruit
{
    String name;
    String taste;
    int size;
    public void eat()
    {
        name = "guava";
        taste = "sweet";
        System.out.println(name+" "+taste);
    }
}
class apple extends fruit{
    public void eat()
    {
        name = "apple";
        taste = "sweet";
        System.out.println(name+" "+taste);
    }
}
class orange extends fruit{
    public void eat()
    {
        name = "orange";
        taste = "sour and sweet";
        System.out.println(name+" "+taste);
    }
}
public class fruitmain {
    public static void main(String[] args) {
        fruit f = new fruit();
        f.eat();
        apple a = new apple();
        a.eat();
        orange o = new orange();
        o.eat();
    }
}
