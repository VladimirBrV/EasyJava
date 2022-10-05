package HomeWork.Homework2.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File  {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("D:\\EasyJava\\EasyJava\\src\\HomeWork\\Homework2\\Task1\\Task2\\my_firste_file.txt");

        BufferedReader bufferedReader = new BufferedReader(file);
        while (bufferedReader.ready()){
            String str = bufferedReader.readLine();
            String str1 = bufferedReader.readLine();

            System.out.println(str+ " "+ str1);
        }
        bufferedReader.close();

    }

}
