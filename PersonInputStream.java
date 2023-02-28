import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PersonInputStream {

    public void read(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);

        int content;
        String stringContent = "" ;
        while((content = fileInputStream.read()) != -1) {
            stringContent += (char) content;
        }
        fileInputStream.close();
        System.out.println(stringContent);;

    };



}