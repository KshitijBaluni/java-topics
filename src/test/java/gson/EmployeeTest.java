package gson;

import com.google.gson.Gson;
import org.junit.Test;

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
    }
}
