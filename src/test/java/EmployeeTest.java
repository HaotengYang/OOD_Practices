import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() {
        employee = new Employee("John Doe", "E123", 20.0);
    }

    @Test
    public void testAddHoursWorked() {
        employee.addHoursWorked(30.0);
        assertEquals(30.0, employee.getHoursWorked(), 0.0);
    }

    @Test
    public void testAddNegativeHours() {
        employee.addHoursWorked(-5.0);
        assertEquals(0.0, employee.getHoursWorked(), 0.0);
    }

    @Test
    public void testResetHoursWorked() {
        employee.addHoursWorked(30.0);
        employee.resetHoursWorked();
        assertEquals(0.0, employee.getHoursWorked(), 0.0);
    }

    @Test
    public void testGetWeeklyCheck() {
        employee.addHoursWorked(40.0);
        Paycheck paycheck = employee.getWeeklyCheck();
        assertEquals(800.0, paycheck.getTotalPay(), 0.0);
    }
}
