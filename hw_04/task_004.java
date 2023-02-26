public class task_004 {

    public static void main(String[] args) {
        int[] array = {19, 2000, -1, 34, 123, 0, -3245, 5, 8};
    }

    private static void heapSort(int[] arr) {
        int arrayLength = arr.length;
        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arrayLength);
        }
    }

}