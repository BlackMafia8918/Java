// Lambda Expression
/*
 * Normal method
 * private void add(int a, int b){
 *      System.out.println(a+b);
 * }
 * Don't have name, modifier, return type
 * Uses an arrow (->)(Lambda/Arrow Operator) to define the parameters
 
 * (int a, int b) -> {System.out.println(a+b);}
*/
interface Drawable{
    public void draw();
}

public class Lamb {
    public static void main(String[] args) {
        int w = 10;

        // with lambda
        Drawable d2 = () ->{
            System.out.println("Drawing: " + w);
        };
        d2.draw();
    }
}