import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;

public class pathFile {
    public static void main(String[] args) throws NumberFormatException, IOException {

        String inputData = getPathToFile("file.txt");
        Map<String, Integer> res = getArguments(inputData);
        String outputData = getPathToFile("output.txt");
        saveResultToFile(outputData, result(res));
        System.out.println("All done!");
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

    static String result(Map<String, Integer> arg) {

        int aNumber = arg.get("a");
        int bNumber = arg.get("b");
        int result = 1;
        String res;
        if (bNumber > 0) {
            for (int i = 1; i <= bNumber; i++) {
                result *= aNumber;
            }
            res = String.valueOf(result);
        } else if (bNumber == 0 && aNumber != 0) {
            res = String.valueOf(result);
        } else if (aNumber == 0 && bNumber == 0) {
            res = "Не определено";
        } else {
            bNumber = bNumber * (-1);
            for (int i = 1; i <= bNumber; i++) {
                result *= aNumber;
            }
            double resultDouble = (double) 1 / result;
            res = String.valueOf(resultDouble);
        }
        return res;
    }

    static void saveResultToFile(String fileName, String res) throws IOException {
        FileWriter dataResult = new FileWriter(fileName, false);
        dataResult.close();
    }

}
