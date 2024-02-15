public class H {
    int a;
    H (int a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        H r = new H(100);
        r.show();
    }
}
