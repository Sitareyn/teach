package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
        1)FileNotFoundException ve IOException Compile time exception dur, yani kod yazarken hata aliriz
        2)FileNotFoundException path in dogrulugu ve dosyanin varligi ile ilgilidir
             IOException tüm imput ve output islemleri ile ilgilidir
        3)IOException class FileNotFoundException class in parentidir
           istenirse FileNotFoundException yarine ioexception da kullanilabilir
        4)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException üstte
        IOException altta kullanilmalidir
         */
    }
}