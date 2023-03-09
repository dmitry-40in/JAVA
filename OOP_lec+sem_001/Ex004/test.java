import java.util.ArrayList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(10);
        int test = 5;
        System.out.println(list.indexOf(test));
        // Возвращает значение -1 если нет элемента в ArrayList
    }
}
