abstract class Person
{
    public abstract void showsalary();
}
abstract class Student extends Person
{
    public abstract void showcurrentyear();
}
class Teacher extends Person{
    public void showsalary()
    {
        System.out.println("teacher is a person having salary = 20000");
    }
    public void subject()
    {
        System.out.println("teacher teaches cs, chemistry, english, others....");
    }
}
class Collegestudent extends Student
{
    public void showsalary()
    {
        System.out.println("no salary for student");
    }
    public void showcurrentyear()
    {
        System.out.println("2nd year");
    }
    public void majorbranch()
    {
        System.out.println("ELECTRICAL ENGINEERING , COMMUNICATIONS");
    }
}
public class tesmain1 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.showsalary();
        Collegestudent c= new Collegestudent();
        c.showsalary();
        c.showcurrentyear();
        c.majorbranch();
    }
}
