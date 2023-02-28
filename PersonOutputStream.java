import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonOutputStream {

    public void write(File file, byte[] data, boolean append) throws IOException {
        
        FileOutputStream fileOutputStream = new FileOutputStream(file, append);

        for (byte b : data) {
            fileOutputStream.write(b);
        }
        fileOutputStream.write("\n".getBytes());
        fileOutputStream.close();
    }
}
