import java.util.Scanner;

public class DeciToQuart {
    public int toQuart(int input){
        if (input == 0){
            return 0;
        }
        StringBuilder res = new StringBuilder();
        while (input > 0){
            int remains = input % 4;
            res.insert(0, remains);
            input /= 4;
        }
        String stringRes = res.toString();
        return Integer.parseInt(stringRes);
    }
}
