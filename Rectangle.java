/* 
class Rectangle {
    public static void main(String[] args) {
        int l = 10;
        int b = 20;

        int A = l*b;
        int P = 2*(l+b);

        System.out.println("Area: " + A);
        System.out.println("Perimeter: " + P);
    }
}
*/
/* 
import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        int l;
        int w;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        l = input.nextInt();
        System.out.println("Enter width: ");
        w = input.nextInt();

        int A = l*w;
        int P = 2*(l+w);

        System.out.println("Area: " + A);
        System.out.println("Perimeter: " + P);
    }
}
*/

/* 
import java.util.Scanner;
class Rectangle {
    int l;
    int w;
    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }
    public int Area() {
        return l * w;
    }
    public int Perimeter() {
        return 2 * (l + w);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = input.nextInt();
        System.out.println("Enter width: ");
        int w = input.nextInt();
        Rectangle rectangle = new Rectangle(l, w);
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
    }
}
*/


