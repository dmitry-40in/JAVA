// дан массив чисел, нужно сформировать новую выборку
// из только четных чисел

public class task_001 {
        public static void main(String[] args) {
            int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int size = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    size++;
                }
            }
            
            int[] array = new int[size];
            int z = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    array[z] = arr[j];
                    z++;
                }
            }

            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
        }
}
