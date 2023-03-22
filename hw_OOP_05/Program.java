import java.util.Stack;


public class Program extends RPN{
    public static void main(String[] args) {

               
        RPN e = new RPN();
        String r = e.getRPN("11+22+33");
        
        System.out.println(r);
    
        double s = e.getResult("11 22 +33+");

        System.out.println(s);

    }
      
    
}
       