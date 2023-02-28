import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TeamOutputStream {
    public void write(File file, String data) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        fw.write(data + "\n");
        fw.close();
    }
}
