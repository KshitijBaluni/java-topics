package gson;

import com.google.gson.Gson;
import org.junit.Test;

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
        assertEquals("{\"name\":\"Ankit\",\"salary\":150,\"totalYearsInComp\":2}",employeeJson);
        Employee empGenerated = gson.fromJson(gson.toJson(employee), Employee.class);
        assertEquals("Employee [name=Ankit, Total years in company=2, salary=150]", empGenerated.toString());
    }
}