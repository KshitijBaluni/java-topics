package gson;

import java.io.*;

public class CreateFile {

    public void writeFile(String str) throws IOException {
        int ch;

        FileWriter fw=new FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        fw.close();
    }


        public String readFile() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    line = br.readLine();
                }
                return sb.toString();
            } finally {
                br.close();
            }
        }
    }