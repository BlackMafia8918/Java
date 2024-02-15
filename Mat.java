/* 
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class Mat {
    public static void main(String[] args) {
        // Creating a MathContext with precision 4 and Rounding Mode HALF_UP;
        MathContext m1 = new MathContext(4, RoundingMode.HALF_UP);

        // Creating a BigDecimal int with specific MathContext
        BigDecimal n1 = new BigDecimal("123.49659349653", m1);
        BigDecimal n2 = new BigDecimal("45.49", m1);

        // Performing arithmetic operations with the specified MathContext
        BigDecimal n3 = n1.add(n2, m1);

        System.out.println("Result : " + n3);
    }
}
*/





import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class Mat {
    public static void main(String[] args) {
        // Creating a MathContext with precision 5 and Rounding Mode HALF_DOWN;
        MathContext m1 = new MathContext(5, RoundingMode.HALF_DOWN);

        // Creating a BigDecimal int with specific MathContext
        BigDecimal n1 = new BigDecimal("123.49659349653", m1);
        BigDecimal n2 = new BigDecimal("45.49", m1);

        // Performing arithmetic operations with the specified MathContext
        BigDecimal n3 = n1.add(n2, m1);

        System.out.println("Result : " + n3);
    }
}
