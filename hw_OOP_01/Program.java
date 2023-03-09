import java.util.ArrayList;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {

        Milk moloko = new Milk("MOLOKOW", 150, 1, "ml", "23.12.2023", 9);
        System.out.println(moloko);

        Lemonade lemonad = new Lemonade("LEMONAD", 120, 1, "ml", 1000);
        System.out.println(lemonad);

        Bread hleb = new Bread("HLEB", 50, 1, "gr", "21.03.2023", "pshenichnaiya");
        System.out.println(hleb);

        Eggs yaica = new Eggs("YAICA", 70, 1, "p", "10.04.2023", 10);
        System.out.println(yaica);

        Masks maska = new Masks("MASKA", 10, 1, "p", 1);
        System.out.println(maska);

        ToiletPaper bumaga = new ToiletPaper("BUMAGA", 300, 1, "m", 10, 3);
        System.out.println(bumaga);

        Diapers hagisi = new Diapers("HAGIS", 500, 1, "p", 1, true, 1, 1, 2, 5);
        System.out.println(hagisi);

        Nipple soska = new Nipple("SOSKA", 50, 1, "p", 1, true);
        System.out.println(soska);

    }
}