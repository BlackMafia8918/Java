class Outer2 
{
    static int data = 30;
    void msg()
    {
        int data = 12;
        System.out.println("Data is: " + data);
    }
    static class A
    {
        void msg()
        {
            System.out.println("Data is: " + data);
        }
    }
    public static void main(String[] args) 
    {
        Outer2.A obj = new Outer2.A();
        Outer2 a = new Outer2(); 
        obj.msg();
        a.msg();
    }
}