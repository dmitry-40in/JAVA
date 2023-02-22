public class exp_001 {

    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o = 154652;
        GetType(o);
        o = "text";
        GetType(o);
        o = 't';
        GetType(o);
    }

    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
}