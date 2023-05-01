package case_study.utils;

import case_study.model.person.Customer;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteCustomer {
    public ArrayList<Customer> readCustomer(String PATH) {
        ArrayList<Customer> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] string = temp.split(",");
                list.add(new Customer(string[0], string[1], string[2], string[3], string[4], string[5], string[6], string[7], string[8]));
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

    public void writeCustomer(ArrayList<Customer> list, String PATH) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(PATH);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer e : list) {
                bufferedWriter.write(e.infoCustomer());
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
