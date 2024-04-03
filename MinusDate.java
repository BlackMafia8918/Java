import java.time.LocalDate;
class MinusYears {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2011, 8, 15);
        System.out.println("Current date: " + localDate);
        System.out.println();
        
        localDate = localDate.minusYears(10);
        System.out.println("New date: " + localDate);
        System.out.println();
        
        localDate = localDate.minusMonths(10);
        System.out.println("New date: " + localDate);
        System.out.println();
        
        localDate = localDate.minusDays(10);
        System.out.println("New date: " + localDate);
        System.out.println();
    }
}