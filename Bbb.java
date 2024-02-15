// Copy Constructor

class Aaa {
    public static void main(String[] args) {
        Bbb r = new Bbb(100, 200);
        r.show();
        Bbb ref = new Bbb(10, "Binod");
    }
}
class Bbb {
    int x, y;
    Bbb(int a, int b){
        x = a;
        y = b;
    }

    Bbb(int a, String b){
        System.out.println(a + " " + b);
    }

    void show(){
        System.out.println(x + " " + y);
    }
}
