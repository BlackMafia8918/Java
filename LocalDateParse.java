import java.time.LocalDate;
class LocalDateParse {
    public static void main(String[] args) {
        String str = "2021-09-01";
        LocalDate d1 = LocalDate.parse(str);
        System.out.println("String to LocalDate: " + d1);
    }
}
