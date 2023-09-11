import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class c10_p1 {
    public static void main(String[] args) throws Exception {

        // Will be explained in c10-note.md
        String filePath = System.getProperty("user.dir") + File.separator + "src\\chapter10\\t1.txt";
        System.out.println(filePath);

        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }

        br.close();
    }
}
