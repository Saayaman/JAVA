import java.text.NumberFormat;
import java.util.Locale;

public class Main5 {
    public static void main(String[] args){


//This line changes the number format to its country!
//da, DK is Denmark!
Locale locale = new Locale("da", "DK");

double doubleValue = 12345_678;
NumberFormat numF = NumberFormat.getNumberInstance(locale);
System.out.println("Number: " + numF.format(doubleValue));

//Locale: if you don't set a country, it automatically becomes the place
//your computer is.
NumberFormat curF = NumberFormat.getCurrencyInstance(locale.JAPAN);
System.out.println("Currency: " + curF.format(doubleValue));

NumberFormat curF2 = NumberFormat.getCurrencyInstance(locale.US);
System.out.println("Currency: " + curF2.format(doubleValue));

NumberFormat intF = NumberFormat.getIntegerInstance();
System.out.println("Integer: " + intF.format(doubleValue));

    }
}
