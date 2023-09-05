import java.util.Scanner;

public class QuarternaryCalc {
    public static void main(String[] args) throws Exception {
        DeciToQuart DQ = new DeciToQuart();
        QuartToDeci QD = new QuartToDeci();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");

        String string = myObj.nextLine();
        String result = String.valueOf(QD.quartToDeci(string));
        System.out.println(result);
    }
}
