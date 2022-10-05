package HomeWork.Homework2.Task3;

import java.io.FileWriter;
import java.io.IOException;

public class Homework3 {
    public static void main(String[] args) throws IOException {

        Financial financial = new Financial(500, 300);



        String file = "D:\\EasyJava\\EasyJava\\src\\HomeWork\\Homework2\\Task3\\report.txt ";

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Incomes =  " + financial.getIncomes() + " ,");
        fileWriter.write("Outcomes = " + financial.getOutcomes());
        fileWriter.close();
    }
}
