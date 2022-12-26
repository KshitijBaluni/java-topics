package gson;

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
}
