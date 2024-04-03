import java.util.Scanner;
class Assertion {
    public static void main(String[] args) {
        int value = 15;
        assert value >= 20 : "Underweight";
        System.out.println("Value is: " + value);
    }   
}