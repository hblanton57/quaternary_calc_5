import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class operationsTest {
    Operations operations = new Operations();

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
}
