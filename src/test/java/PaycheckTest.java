import org.junit.Test;
import static org.junit.Assert.*;

public class PaycheckTest {

    @Test
    public void testTotalPayWithoutOvertime() {
        Paycheck paycheck = new Paycheck(20.0, 40.0);
        assertEquals(800.0, paycheck.getTotalPay(), 0.0);
    }

    @Test
    public void testTotalPayWithOvertime() {
        Paycheck paycheck = new Paycheck(20.0, 45.0);
        assertEquals(950.0, paycheck.getTotalPay(), 0.0);
    }

    @Test
    public void testPayAfterTaxesBelowThreshold() {
        Paycheck paycheck = new Paycheck(10.0, 30.0);
        assertEquals(270.0, paycheck.getPayAfterTaxes(), 0.0);
    }

    @Test
    public void testPayAfterTaxesAboveThreshold() {
        Paycheck paycheck = new Paycheck(20.0, 40.0);
        assertEquals(680.0, paycheck.getPayAfterTaxes(), 0.0);
    }
}
