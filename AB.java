class AB {
    int a;
    String b;
    boolean c;
    AB(){
        a = 100;
        b = "abc";
        c = true;
    }
    void Disp(){
        System.out.println(a + " " + b + " " + c);
    }    
}
class BB{
    public static void main(String[] args) {
        AB r = new AB();
        r.Disp();
    }
}