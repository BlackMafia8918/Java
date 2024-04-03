import java.time.LocalDate;
class LeapYearEx {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2024, 2, 29);
        System.out.println(d.isLeapYear());
        System.out.println(d.getDayOfMonth());        
    }
}