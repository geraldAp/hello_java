import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        // Buffer writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/geraldamankwah/Desktop/myfile2.txt"));

        bufferedWriter.write("This is the first line I am writing");
        bufferedWriter.write(System.lineSeparator()); // since /n will not work in
        // this case we use the lineSeparator
        bufferedWriter.write("This is the second line I am writing");
        // to avoid memory leaks
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/geraldamankwah/Desktop/myfile.txt"));

        String line = bufferedReader.readLine();

        if (line == null) {
            System.out.println("File is empty!");
        }

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();

    }
}
