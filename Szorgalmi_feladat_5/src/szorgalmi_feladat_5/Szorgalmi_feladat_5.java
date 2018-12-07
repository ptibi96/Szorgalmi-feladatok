package szorgalmi_feladat_5;
import java.util.Scanner;
/**
 *
 * @author Tibi
 */
public class Szorgalmi_feladat_5 {

    public static void main(String[] args) {

        /*FELADAT: Készítsünk programot, mely elkészít - egy felhasználó által beírt - n darab elemet az alábbi sorozatból: 1,2,4,7,11,16,22,29,37,....(+1,+2,+3,+4....)**/

// xn = n(n-1)/2 + 1
        double beker;
        double db;
        int xn;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérem adjon meg egy 1-től nagybb számot!");
        
        db=sc.nextDouble();
        
        db=Math.abs(db);
            
        for (int i = 1; i <= (int)db; i++) {
           
            xn = i * (i - 1) / 2 + 1;
            System.out.print(xn+" ");
       
        }

    }

}
