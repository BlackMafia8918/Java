// "this" object in Java

class D{
    void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        D r = new D();
        System.out.println(r);
        r.show();
    }
}