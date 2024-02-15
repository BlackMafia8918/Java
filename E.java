// Private Constructor


public class E {
    int a;
    double b;
    String c;
    private E()
    {
        a = 10;
        b = 30.56;
        c = "learn";
        System.out.println(a + " " + b + " " + c);
    }    
    public static void main(String[] args) {
        E r = new E();
    }
}
