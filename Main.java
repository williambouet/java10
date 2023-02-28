import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        /* VERSION STREAM */

        PersonInputStream pIS = new PersonInputStream();
        PersonOutputStream pOS = new PersonOutputStream();
        Person person = new Person("a", 0);
        Person person2 = new Person("will", 0);
        Person person3 = new Person("iam", 0);

        File filep = new File("person.txt");
        byte[] data = person.getName().getBytes();

        pOS.write(filep, data, true);
        pOS.write(filep, Integer.toString(person.getAge()).getBytes(), true);
        pIS.read(filep);



        /* VERSION FILEREADER FILEWRITER */
        File file = new File("team.txt");
        TeamInputStream tIS = new TeamInputStream();
        TeamOutputStream tOS = new TeamOutputStream();

        ArrayList<Person> list = new ArrayList<>();
        list.add(person3);
        list.add(person2);
        list.add(person);

        for (Person p : list) {
            tOS.write(file, p.getName());
        }

        tIS.read(file);
    }

}
