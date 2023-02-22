
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
        mergeArray(int[] arr, int[] leftArray, int[] rightArray);
    }

    private static void mergeArray(int[] arr, int[] leftArray, int[] rightArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] < rightArray[j]) {
                arr[index] = leftArray[i];
                i++;
            } else {
                arr[index] = rightArray[j];
                j++;
            }
            index++;
        }
        
        for (int k = i; k < leftArrayLength; k++) {
            arr[index] = leftArray[k]; // попробовать писать arr[index++]
            index++;
        }

        for (int l = j; l < rightArrayLength; l++) {
            arr[index] = rightArray[l];
            index++;
        }
    }

}