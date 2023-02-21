package homeWork11.task1;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputOutput {

    public void writeListPersonToFile(List<Person> persons) {

        try(FileWriter fileWriter = new FileWriter("src/main/resources/listPersons_1.txt")) {
            for (Person person : persons) {
                fileWriter.write(person + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getListPersonsFromFile(String fileName) {

        List<Person> list = new ArrayList<>();
        String currentLine;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/" + fileName))) {

            while ((currentLine = bufferedReader.readLine()) != null){
                String[] values = StringUtils.splitString(currentLine, "_");
                list.add(new Person(values[0], values[1], Integer.parseInt(values[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
