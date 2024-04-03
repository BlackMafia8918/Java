import java.time.LocalDate;
class PlusDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2011, 8, 15);
        System.out.println("Current date: " + localDate);
        System.out.println();

        localDate = localDate.plusYears(10);
        System.out.println("New date: " + localDate);
        System.out.println();
        
        localDate = localDate.plusMonths(10);
        System.out.println("New date: " + localDate);
        System.out.println();
        
        localDate = localDate.plusDays(10);
        System.out.println("New date: " + localDate);
        System.out.println();
    }
}