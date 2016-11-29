
import java.math.BigDecimal;
import java.math.MathContext;
/**
 * Created by ayako_sayama on 2016/11/15.
 */
public class PROJECT6 {

    static boolean bDef;

    public static void main(String[] args) {


        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;
        float f = 1f;
        double d = 1;

        System.out.println("These are the Primitive Data Types");
        System.out.println("Byte:" + b);
        System.out.println("Short:" + sh);
        System.out.println("Long:" + l);
        System.out.println("Float:" + f);
        System.out.println("double:" + d);


        //Playing with Double

        double value = .012;
        double pSum = value + value + value;

        System.out.println("Sum of double primitive value: " + pSum);

        //Playing with toString

        double value2 = .102;
        String strValue = Double.toString(value2);
        System.out.println("strValue: " + strValue);

        //Playing with bigDecimals add()
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());


        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The Long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The Short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The Byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("The Double to int: " + intValue4);

        int intvalue1 = 56;
        int intvalue2 = 42;

        int result1 = intvalue1 + intvalue2;
        System.out.println("Addition: " + result1);

        int result2 = intvalue1 - intvalue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intvalue1 * intvalue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intvalue1 / intvalue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intvalue1 % intvalue2;
        System.out.println("Remainder: " + result5);

        double doubleValue2 = -3.99999;
        long rounded = Math.round(doubleValue2);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(rounded);
        System.out.println("Absolute: " + absValue);

   }

}
