import java.util.Arrays;
import java.util.List;

public class exp_004 {
    public static void main(String[] args) {
        String day = new String("28");
        String month = new String("11");
        String year = new String("2023");
        String[] date = new String[] {day, month, year};
        List<String> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new String("09");
        month = "12";
        System.out.println(date);
        // for (StringBuilder stringBuilder : date) {
        //     System.out.println(stringBuilder);
        // }
        System.out.println(date);
    }
    
}