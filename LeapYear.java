import java.time.LocalDate;
class LeapYear {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2020, 11, 8);
        System.out.println(d1.isLeapYear());
        LocalDate d2 = LocalDate.of(2018, 11, 8);
        System.out.println(d2.isLeapYear());
    }
}
