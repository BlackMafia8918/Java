import java.time.LocalDate;
public class WithDay {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2018-05-30");
        System.out.println("The date is: " + d1);
        LocalDate result = d1.withDayOfMonth(22);
        System.out.println("The date with day is: " + result);
    }
}