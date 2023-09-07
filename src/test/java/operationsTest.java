import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class operationsTest {
    Operations operations = new Operations();

    @Test
    public void testDivision(){
        int result = (int) operations.division(25,5);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testMultiple(){
        int result = operations.multiple(5,5);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void testAddition(){
        int result = operations.Addition(5,5);
        Assertions.assertEquals(10,result);
    }
    @Test
    public void testSub(){
        int result = operations.subtraction(50,5);
        Assertions.assertEquals(45,result);
    }

    @Test
    public void testSquareRoot() {
        double result = operations.squareRoute(144);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testSquareRoot2() {
        double result = operations.squareRoute(67);
        Assertions.assertEquals(8.18535277187245, result);
    }

    @Test
    public void testSquare() {
        double result = operations.square(5);
        Assertions.assertEquals(25, result);
    }
    @Test
    public void testSquare2() {
        double result = operations.square(15);
        Assertions.assertEquals(225, result);
    }
}
