
public class task_003 {
  
    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 5, 8, 2, 0, -3, 11, 100, 112, 21 };
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();

        int length = array.length;
        System.out.println(length);

        int lengthLeftArray = 0;
        int lengthRightArray = 0;

        if (array.length > 1) {
            if (array.length % 2 == 0) {
                lengthLeftArray = array.length / 2;
                lengthRightArray = array.length / 2;
            } else {
                lengthLeftArray = array.length / 2;
                lengthRightArray = array.length / 2 + 1;
            }
        } else {
            System.out.println(array[0]);
        }

        System.out.println(lengthLeftArray + " " + lengthRightArray);



        

    }

}