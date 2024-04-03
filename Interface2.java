import java.util.Scanner;
interface Ad {
    void a1();    
    void a2();    
    default void a3(){
        System.out.println("May or May not override in implementing class");
    }    
}
class Bd implements Ad{
    public void a1()
    {
        System.out.println("class B a1()");
    }
    public void a2()
    {
        System.out.println("class B a2()");
    }
    public void a3()
    {
        System.out.println("class B a3()");
    }
}

class Cd implements Ad{
    public void a1()
    {
        System.out.println("class C a1()");
    }
    public void a2()
    {
        System.out.println("class C a2()");
    }
    public void a3()
    {
        System.out.println("class C a3()");
    }
}
class Md{
    public static void main(String[] args) {
        Bd b = new Bd();
        b.a1();
        b.a2();
        b.a3();
        Cd c = new Cd();
        c.a1();
        c.a2();
        c.a3();
    }
}