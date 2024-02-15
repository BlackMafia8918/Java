import java.math.BigDecimal;
class Main {
    public static void main(String[] args) {
        Double a = 1.5;
        Double b = 1.50;

        System.out.println(a.equals(b));

        BigDecimal x = new BigDecimal("1.5");
        BigDecimal y = new BigDecimal("1.50");

        System.out.println(x.equals(y));
    }    
}