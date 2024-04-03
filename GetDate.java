import java.time.LocalDate;
class Year {
    public static void main(String[] args) {
        LocalDate loc = LocalDate.of(2021, 1, 01);
        System.out.println("Year: " + loc.getYear());
        System.out.println();
        System.out.println("Month: " + loc.getMonth() + " " + loc.getMonthValue());
        System.out.println();
        System.out.println("Day: " + loc.getDayOfMonth());
        System.out.println();
        System.out.println("Day: " + loc.getDayOfWeek());
        System.out.println();
    }
}
