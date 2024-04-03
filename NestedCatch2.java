public class NestedCatch2 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException n) {
            System.err.println("Error: Null value can't be used.");
        } 
        System.out.println("Main Method Ended");
    }
}