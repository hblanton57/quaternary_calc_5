import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    public QuarternaryCalc quarternaryCalc = new QuarternaryCalc();
    public DecimalToQuarternary DtQ = new DecimalToQuarternary();
    @Test
    public void testQuarternary() {
        int result = DtQ.decimalToQuarternary(123);
        Assertions.assertEquals(57, result);
    }
}
