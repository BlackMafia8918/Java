import java.util.Scanner;
class SumNatural {
    public static void main(String[] args) {
        int n, i = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find the sum ----> ");
        n = input.nextInt();
        do{
            sum += i;
            i += 1;
        }
        while(i <= n);
        System.out.println("Sum of first " + n + " numbers is = " + sum);
    }
}
