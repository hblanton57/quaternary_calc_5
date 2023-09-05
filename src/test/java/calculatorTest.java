import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    public DeciToQuart calc = new DeciToQuart();
    @Test
    public void testQuarternary() {
        int result = calc.converter("321");
        Assertions.assertEquals(57, result);
    }
}
