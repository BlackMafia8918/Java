import java.time.LocalDate;

class LocalDateExample{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today's date: " + date);
        System.out.println("Yesterday's date: " + yesterday);
        System.out.println("Tomorrow's date: " + tomorrow);
    }
}
