import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    // we don't need to wrap in a try and catch block since this has been declared
    // with a throw meaning the method can throw an exception that we don't handle
    // our self but who ever calls the exception a good case would be a reusable
    // method
    public void readFile() throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/geraldamankwah/Desktop/myfile.txt"));

        String line = bufferedReader.readLine();

          // Check if the file is empty
          if (line == null) {
            throw new IOException("The file is empty.");
        }

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
