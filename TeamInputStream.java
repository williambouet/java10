import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TeamInputStream {

    public void read(File file) throws IOException {

        String line;
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
