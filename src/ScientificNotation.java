import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ScientificNotation {
    public static void main(String[] args) {
        // we define two floating point values using scientific notation
        double n = 1.235E10; // this is the floating point value of a double type , written in scientific notation.
        DecimalFormat dec = new DecimalFormat("#.00");
        System.out.println(dec.format(n));
        BigDecimal bd = new BigDecimal("1.212e-19"); // we use the DecimalFormat class to arrange our double value into standard decimal format


        System.out.println(bd.toEngineeringString()); // we use two methods of the class to print the value in the engineering and plain string
        System.out.println(bd.toPlainString());
    }
}
