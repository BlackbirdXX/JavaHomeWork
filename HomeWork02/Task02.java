// Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!) 
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HomeWork02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task02 {
 
    public static void main(String[] args) {
        
        File file = new File("HomeWork02/DataTask02.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
           
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] temp = line.split(" ");
                // System.out.println(temp[0]);
                StringBuilder result = new StringBuilder();
                result.append("Студент ");
                result.append(temp[0]);
                result.append(" получил ");
                result.append(temp[1]);
                result.append(" по предмету ");
                result.append(temp[2] + ".");
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}
}