public class test {
    public static void main(String[] args) {
        // recursion();
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);
    }
    // static void recursion() {
    //     System.out.println("***");
    //     recursion();
    
    
    // }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println("length = " + arr.length);
    }

}
