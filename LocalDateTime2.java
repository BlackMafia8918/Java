import java.time.LocalDateTime;
class LocalDateTime2 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        LocalDateTime d1 = d.plusDays(2);
        System.out.println(d);
        System.out.println(" ");
        System.out.println(d1);
    }
}