import java.util.Scanner;

public class QuarternaryCalc {
    public static void main(String[] args) throws Exception {
        DeciToQuart DQ = new DeciToQuart();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");

        String string = myObj.nextLine();
        int result = DQ.converter(string);
        System.out.println(result);
    }
}
