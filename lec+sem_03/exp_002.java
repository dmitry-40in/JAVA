public class exp_002 {
    public static void main(String[] args) {
        System.out.println(Sum(1.5, 4));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        }
        else{
            return 0;
        }
        // return (Object) ((Integer) a + (Integer) b);
    }
}
