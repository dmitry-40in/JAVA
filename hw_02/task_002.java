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




import java.io.File;

public class task_002 {

    public void main(String[] args) {
        File f1 = new File("input.txt"); // import java.io.File;
  

        System.out.println(f1);

        
        


    }

    static String getPathToFile(String fileName) {
        String fileSeparatorSymbol = System.getProperty("file.separator");
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject + fileSeparatorSymbol + fileName;
        return pathFile;
    }
    
}
