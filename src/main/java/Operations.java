public class Operations {
    public int Addition(int number1, int number2){
        return number1 + number2;
    }
    public int multiple(int number1, int number2){
        return number1 * number2;
    }
    public int subtraction(int number1, int number2){
        return number1 - number2;
    }
    public double division(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Division by zero not allowed bud");
        }
        return (double) number1/number2;
    }
    public double squareRoute(double number){
        return Math.sqrt(number);
    }
    public double square(double number){
        return Math.pow(number, 2);
    }
}
