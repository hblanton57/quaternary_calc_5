import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    public DeciToQuart calc = new DeciToQuart();
    @Test
    public void testQuarternary() {
        int result = calc.converter("321");
        Assertions.assertEquals(57, result);
    }
    @Test
    public void testDeci(){
        Assertions.assertEquals(10,QuartToDeci.quartToDeci(String.valueOf(22)));
        Assertions.assertEquals(13,QuartToDeci.quartToDeci(String.valueOf(31)));
        Assertions.assertEquals(28,QuartToDeci.quartToDeci(String.valueOf(130)));
        Assertions.assertEquals(46,QuartToDeci.quartToDeci(String.valueOf(232)));
    }
}
