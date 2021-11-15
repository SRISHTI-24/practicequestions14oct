class shaped
{
    public void draw()
    {
        System.out.println("Drawing shape");
    }
    public void erase()
    {
        System.out.println("Erasing shape");
    }
}
class circle extends shaped{
    public void draw()
    {
        System.out.println("Drawing circle");
    }
    public void erase()
    {
        System.out.println("Erasing circle");
    }
}
class Triangle extends shaped{
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }
    public void erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends shaped{
    public void draw()
    {
        System.out.println("Drawing Square");
    }
    public void erase()
    {
        System.out.println("Erasing Square");
    }
}
public class shapemain {
    public static void main(String[] args) {
        shaped c = new circle();
        c.draw();
        c.erase();
        shaped t = new Triangle();
        t.draw();
        t.erase();
        shaped s = new Square();
        s.draw();
        s.erase();
    }
}
