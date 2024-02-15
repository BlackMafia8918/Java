public class C {
    public static void Add() {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a+b));
    }    
    public static void main(String[] args) {
        C r = new C();
        r.Disp();
        C.Add();
    }
    void Disp(){
        System.out.print("Learn Coding\n");
    }
}
