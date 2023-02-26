public class task_004 {

    public static void main(String[] args) {
        int[] array = { 19, 2000, -1, 34, 123, 0, -3245, 5, 8 };

        System.out.println("Массив для сортировки:");
        printArray(array);
        heapSort(array);
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    private static void heapSort(int[] arr) {
        int arrayLength = arr.length;
        int tmp;

        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arrayLength);
        }

        for (int i = arrayLength - 1; i >= 0; i--) {
            tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;

            heapify(arr, 0, i);
        }

    }

    private static void heapify(int[] arr, int i, int arrLength) {
        int leftChildIndex = 2 * i + 1;
        int rigtChildIndex = 2 * i + 2;
        int largestIndex = i;
        int tmp;

        if (leftChildIndex < arrLength && arr[leftChildIndex] > arr[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        if (rigtChildIndex < arrLength && arr[rigtChildIndex] > arr[largestIndex]) {
            largestIndex = rigtChildIndex;
        }

        if (i != largestIndex) {
            tmp = arr[i];
            arr[i] = arr[largestIndex];
            arr[largestIndex] = tmp;

            heapify(arr, largestIndex, arrLength); // посмотерть как при рекурсии эта строка работает с ограничениями
                                                   // heapSort
        }

    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

}