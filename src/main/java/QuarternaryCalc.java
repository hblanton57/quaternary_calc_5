import java.util.Scanner;

public class QuarternaryCalc {
    public static void main(String[] args) throws Exception {
        DeciToQuart DQ = new DeciToQuart();
        QuartToDeci QD = new QuartToDeci();
        Operations op = new Operations();
        int result = 0;
        double sqrt = 0.0;


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int number1 = Integer.parseInt(myObj.nextLine());
        System.out.println("Enter Operation or sqrt");
        String operator =  myObj.nextLine();
        System.out.println("Enter 2nd number");
        int number2 = Integer.parseInt(myObj.nextLine());
        switch(operator){
            case "+":
                result = op.Addition(number1,number2);
                break;
            case "-":
                result = op.subtraction(number1,number2);
                break;
            case "*":
                result = op.multiple(number1,number2);
                break;
            case "/":
                result = (int) op.division(number1,number2);
                break;
        }
        //String string = myObj.nextLine();
        //String result = String.valueOf(QD.quartToDeci(string));
        System.out.println(result);
        //System.out.println(sqrt);
    }
}
