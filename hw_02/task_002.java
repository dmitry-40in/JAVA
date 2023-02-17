/**
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
 * Пример 1: а = 3, b = 2, ответ: 9 
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 * Пример 4: а = 0, b = 0, ответ: не определено
 * Пример 5 
 * входные данные находятся в файле input.txt в виде
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt
 * 1000
 */

package hw_02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;

public class task_002 {

    public void main(String[] args) {


        
        


    }

    static String getPathToFile(String fileName) {
        String fileSeparatorSymbol = System.getProperty("file.separator");
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject + fileSeparatorSymbol + fileName;
        return pathFile;
    }
    
    static Map<String, Integer> getArguments(String pathFile) throws NumberFormatException, IOException {
        BufferedReader data = new BufferedReader(new FileReader(pathFile));
        Map<String, Integer> arguments = new HashMap<String, Integer>();
        String line;
        while ((line = data.readLine()) != null) {
            String[] keyValue = line.split(" ");
            arguments.put(keyValue[0], Integer.valueOf(keyValue[1]));
        }
        data.close();
        return arguments;
    }
}
