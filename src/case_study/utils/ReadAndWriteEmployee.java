package case_study.utils;

import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteEmployee {
    public ArrayList<Employee> readEmployee(String PATH) {
        ArrayList<Employee> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] string = temp.split(",");
                list.add(new Employee(string[0], string[1], string[2], string[3], string[4], string[5], string[6], string[7], string[8], Double.parseDouble(string[9])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeEmployee(ArrayList<Employee> list, String PATH) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(PATH);
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : list) {
                bufferedWriter.write(e.infoEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
