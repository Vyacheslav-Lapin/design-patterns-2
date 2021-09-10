package refactoring_guru.decorator.example;

import refactoring_guru.decorator.example.decorators.CompressionDecorator;
import refactoring_guru.decorator.example.decorators.DataSource;
import refactoring_guru.decorator.example.decorators.DataSourceDecorator;
import refactoring_guru.decorator.example.decorators.EncryptionDecorator;
import refactoring_guru.decorator.example.decorators.FileDataSource;

public class Demo {
  public static void main(String[] args) {
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
    DataSourceDecorator encoded = new CompressionDecorator(
        new EncryptionDecorator(
            new FileDataSource("out/OutputDemo.txt")));
    encoded.writeData(salaryRecords);
    DataSource plain = new FileDataSource("out/OutputDemo.txt");

    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encoded.readData());
  }
}
