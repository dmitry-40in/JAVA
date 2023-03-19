public class Program {
    public static void main(String[] args) {

        Cat cat = new Cat("Marusya", 2);

        Integer a = 12345;

        String b = "qwerty";

        // printF();

        System.out.println(printX(a));
        System.out.println();

        System.out.println(printX(cat));
        System.out.println();

        System.out.println(printX(b));
        System.out.println();

        System.out.println(printX("0"));

    }

    // public static void printF() {
    // System.out.println("FFFFFFFF");
    // }

    public static <R> StringBuilder printX(R something) {
        StringBuilder str = new StringBuilder();
        if (something instanceof Cat) { 
            Cat x = (Cat) something;
            str.append("{\n");
            str.append("name: " + x.getName() + "\n");
            str.append("price: " + x.getPrice() + "\n");
            str.append("}\n");
            }
        else if (something instanceof Integer) {
            // str.append("{\n");
            str.append((Integer)something + "\n");
            // str.append("}\n");
        }
        else {
            // str.append("{\n");
            str.append("\"" + (String)something + "\"" + "\n");
            // str.append("}\n");
        } 
        return str;
        }

}