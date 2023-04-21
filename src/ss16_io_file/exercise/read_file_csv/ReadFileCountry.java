package ss16_io_file.exercise.read_file_csv;

import ss10_array_list.excercise.my_list.model.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadFileCountry {
    public static void readFileCountry() {
        String PATH = "ss16_io_file/exercise/read_file_csv/country.csv";
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        ArrayList<Country> arrayList = new ArrayList<>();
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] string = temp.split(",");
              arrayList.add(new Country(Integer.parseInt(string[0]),string[1],string[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country c:arrayList) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        ReadFileCountry.readFileCountry();
    }
}
