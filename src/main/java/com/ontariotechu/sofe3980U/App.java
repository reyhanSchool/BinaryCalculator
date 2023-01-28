package main.java.com.ontariotechu.sofe3980U;
import main.java.com.ontariotechu.sofe3980U.Binary;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program:  The entry point of the program. The local time will be printed first,
     *      Then it will create two binary variables, add them and print the result.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
        System.out.println("\nStarting Binary Calculator...");
        System.out.println("1-\tBinary Addition\n2-\tBinary Multiplication\n3-\tBitwise AND\n4-\tBitwise OR\nEnter your selection:\t");
        Scanner scanner = new Scanner(System.in);
        String userSelection = scanner.nextLine();
        System.out.println("Enter the first binary value:\t");
        String binaryInput1 = scanner.nextLine();
        Binary binary1 = new Binary(binaryInput1);
        System.out.println("Enter the second binary value:\t");
        String binaryInput2 = scanner.nextLine();
        Binary binary2 = new Binary(binaryInput2);
        Binary result = null;
        if (userSelection.equals("1")) {
            result = Binary.add(binary1, binary2);
            System.out.println("The result of addition is:\t" + result.getValue());
        } else if (userSelection.equals("2")) {
            result = Binary.Multiply(binary1, binary2);
            System.out.println("The result of multiplication is:\t" + result.getValue());
        } else if (userSelection.equals("3")) {
            result = Binary.AND(binary1, binary2);
            System.out.println("The result of bitwise AND is:\t" + result.getValue());
        } else if (userSelection.equals("4")) {
            result = Binary.OR(binary1, binary2);
            System.out.println("The result of bitwise OR is:\t" + result.getValue());
        } else {
            System.out.println("Invalid entry.");
        }
    }
}