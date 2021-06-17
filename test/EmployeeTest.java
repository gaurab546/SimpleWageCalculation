import com.company.Employee;
import com.company.Main;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    Employee employee =new Employee();
    Main obb = new Main();

    @Test
    public void testCalculation(){
        employee.setName("Ram");
        employee.setHourlyWage(35.5);
        employee.setWorkingHour(65.5);

        double calculator = employee.calculation(501,1);
        assertEquals(501*0.84, calculator);
    }


}