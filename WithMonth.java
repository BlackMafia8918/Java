import java.time.LocalDate;
public class WithMonth {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2018-05-30");
        System.out.println("The date is: " + d1);
        LocalDate result = d1.withMonth(02);
        System.out.println("The date with month is: " + result);
    }
}