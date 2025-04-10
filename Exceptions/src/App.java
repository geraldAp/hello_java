import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {


        try {
            FileWriter fileWriter = new FileWriter("/Users/geraldamankwah/Desktop/myfile.txt");
            System.out.println("Hello, World!");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace(); // this prints out the problem where java is not able to find the file 
        }
    }
}
