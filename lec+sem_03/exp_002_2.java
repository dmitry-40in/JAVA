import java.util.ArrayList;

public class exp_002_2 {
 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(123);
            for (Object i : list) {
                System.out.println(i);
                
            }
            System.out.println();
            list.add(4);
            list.add(66);
            list.add(34);
            list.add(-2);
            list.add(0);
            System.out.println(list.get(1));
           
            for (Integer j : list) {
                System.out.printf("%d ", j); 
            }
            System.out.println();
            list.subList(0, 4);
            for (Integer j : list) {
                System.out.printf("%d ", j);
            }
                
            
    }
}
