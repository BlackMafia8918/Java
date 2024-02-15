import java.util.Scanner;
class Switt {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter first value: ");
        a = r.nextInt();
        System.out.println("Enter second value: ");
        b = r.nextInt();
        System.out.println("Enter your choice: ");
        ch = r.nextInt();
        
        switch (ch) {
            case 1: System.out.println("Sum: " + (a+b));
                break;
            case 2: System.out.println("Sub: " + (a-b));
                break;
            case 3: System.out.println("Mul: " + (a*b));
                break;
            case 4: System.out.println("Div: " + (a/b));
                break;  
            default: System.out.println("Invalid Choice");
        }
    }        
}
