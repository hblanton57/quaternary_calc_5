import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public DeciToQuart calc = new DeciToQuart();
    public QuartToDeci QDcalc = new QuartToDeci();
    @Test
    public void testQuaternary() {
        int result = calc.toQuart(57);
        Assertions.assertEquals(321, result);
    }
    @Test
    public void testQuaternary2() {
        int result = calc.toQuart(15);
        Assertions.assertEquals(33, result);
    }
    @Test
    public void testDeci(){
        Assertions.assertEquals(10,QuartToDeci.quartToDeci(String.valueOf(22)));
        Assertions.assertEquals(13,QuartToDeci.quartToDeci(String.valueOf(31)));
        Assertions.assertEquals(28,QuartToDeci.quartToDeci(String.valueOf(130)));
        Assertions.assertEquals(46,QuartToDeci.quartToDeci(String.valueOf(232)));
    }

    @Test
    public void testQuartToDeciToQuart(){
        int Qresult = QDcalc.quartToDeci("321");
        int Dresult = calc.toQuart(Qresult);
        Assertions.assertEquals(57,Qresult);
        Assertions.assertEquals(321,Dresult);
    }
}
