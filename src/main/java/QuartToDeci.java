public class QuartToDeci {
    public int quartToDeci(String input){
        int decimalNum = 0;
        for (int i = input.length()-1; i >= 0; i--){
            int digit = Character.getNumericValue(input.charAt(i));
            decimalNum += digit * Math.pow(4,input.length()-1-i);
        }
        return decimalNum;
    }
}
