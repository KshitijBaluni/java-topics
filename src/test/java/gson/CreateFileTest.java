package gson;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CreateFileTest {

    @Test
    public void writeFile() throws IOException {
        String str="input output data stream";
        CreateFile createFile=new CreateFile();
        createFile.writeFile(str);
        String reader=createFile.readFile();
        assertEquals("input output data stream", reader );


    }
    @Test
    public void gsonTest() throws IOException {
        Gson gson =new Gson();
        Employee employee=new Employee();
        employee.setName("Ankit");
        employee.setSalary(150);
        employee.setTotalYearsInComp(2);
        String employeeJson = gson.toJson(employee);
        CreateFile createFile=new CreateFile();
        createFile.writeFile(employeeJson);
        String reader=createFile.readFile();
        assertEquals("{\"name\":\"Ankit\",\"salary\":150,\"totalYearsInComp\":2}",reader);

    }
}
