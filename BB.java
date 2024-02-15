class BB {
    int x, y;
    BB(int a, int b){
        x = a;
        y = b;
    }
    void show(){
        System.out.println(x + " " + y);
    }
}
class AA {
    public static void main(String[] args) {
        BB r = new BB(100, 200);
        r.show();
    }    
}
