import java.math.BigDecimal;
class BigDeci{
    public static void main(String[] args) {
        
        BigDecimal bd1 = new BigDecimal("1234567890.9876543210");
        BigDecimal bd2 = new BigDecimal("124567890.987653210");
        
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 = " + bd1);
    }    
}
