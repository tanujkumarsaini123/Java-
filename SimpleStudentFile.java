import java.io.*;

public class SimpleStudentFile {
    public static void main(String[] args) {
        try {
        
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\TANUJ KUMAR SAINI\\Downloads\\Reading and Communication.txt"));
            bw.write("1");
            bw.newLine();
            bw.write("Tanuj");
            bw.newLine();
            bw.write("8.5");
            bw.newLine();
            bw.write("A");
            bw.close();

            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\TANUJ KUMAR SAINI\\Downloads\\Reading and Communication.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
