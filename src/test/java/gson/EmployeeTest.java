package gson;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void gsonTest(){
        Gson gson =new Gson();
        Employee employee=new Employee();
        employee.setName("Ankit");
        employee.setSalary(150);
        employee.setTotalYearsInComp(2);
        String employeeJson = gson.toJson(employee);
        System.out.println(employeeJson);
        assertEquals("{\"name\":\"Ankit\",\"salary\":150,\"totalYearsInComp\":2}",employeeJson);

        Employee empGenerated = gson.fromJson(
                gson.toJson(employee), Employee.class);
        System.out.println(empGenerated);
        assertEquals("Employee [name=Ankit, Total years in company=2, salary=150]", empGenerated);




    }
}
