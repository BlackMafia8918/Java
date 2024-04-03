import java.time.LocalDate;
class WithYear {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2018-05-30");
        System.out.println("The date is: " + d1);
        LocalDate result = d1.withYear(2014);
        System.out.println("The date with year is: " + result);
    }
}