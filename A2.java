public class A2 
{
    static int a=10;
    void fun()
    {
        int b=10;
        System.out.println(a+"  "+b);
        ++a; ++b;
    }   
    public static void main(String[] args) 
    {
        A2 r = new A2();
        r.fun();
        r.fun();
    }
}
