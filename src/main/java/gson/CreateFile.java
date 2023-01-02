package gson;

import java.io.*;

/**
 * gson
 *
 * @author Ankit Rawat
 * @since 22 Dec 2022
 */
public class CreateFile {

    /**
     * Write into output.txt file
     *
     * @param str-String to write in file
     * @return name
     */
    public void writeFile(String str) throws IOException {
        int ch;

        FileWriter fw=new FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        fw.close();
    }

    /**
     * Read file from output.txt file
     *
     * @return sb.toString string form of stringbuilder reference
     */
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
    }}