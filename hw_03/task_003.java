
public class task_003 {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 5, 8, 2, 0, -3, 11, 100, 112, 21 };
        
    }

    private static void splitArray(int[] arr) {
        int lengthArray = arr.length;
        if (lengthArray == 1) {
            return; //==================================
        }

        int middleArray = lengthArray / 2;
        int[] leftArray = new int[middleArray];
        int[] rightArray = new int[lengthArray - middleArray];

        for (int i = 0; i < middleArray; i++) {
            leftArray[i] = arr[i];
        }

        for (int i = middleArray; i < lengthArray; i++) {
            rightArray[i] = arr[i]; // возможно тут ошибка
        }

        splitArray(leftArray);
        splitArray(rightArray);

    }

}