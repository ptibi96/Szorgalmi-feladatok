package szorgalmi_feladat_1;

/**
 *
 * @author Tibi
 */
public class Szorgalmi_feladat_1 {
    
    public static void main(String[] args) {
        
  
        
        /* FELADAT: Adott egy egészeket tartalmazó, legalább 2 hosszú tömb. Írjunk programot, mely felcserél 2 véletlenül választott elemet a tömbből segédtömb használata nélkül**/    
        

        
        final int HOSSZ = (int) (5 * Math.random() + 2);
        
        int csere_1 = (int) (5 * Math.random() + 0);
        int csere_2 = (int) (5 * Math.random() + 0);
        
        int tmp = 0;
        
        int t_elemek;
        
        int t[] = new int[HOSSZ];

        System.out.println("A tömb elemei:"+"\n");
        for (int i = 0; i < HOSSZ; i++) {
            
            t[i] = (int) (100 * Math.random() + 1);
            System.out.print(t[i] + "  ");
            
        }
        
        System.out.println("\n");

  
            
            while (csere_1 > HOSSZ - 1) {
//                System.out.println(csere_1 + " egy " + HOSSZ);
                csere_1 = (int) (5 * Math.random() + 0);
                
            }
            
        
       
            
            while (csere_2 > HOSSZ - 1) {
//                System.out.println(csere_2 + " ketto " + HOSSZ);
                csere_2 = (int) (5 * Math.random() + 0);
                
            }
        

        
        if (csere_1 == csere_2) {
//            System.out.println("enged");
            if (csere_1==HOSSZ-1) {
//                System.out.println("belep");
                csere_1 -= 1;
                csere_2 -=1;
            }
            csere_1 += 1;
            
            
            tmp = t[csere_1];
            t[csere_1] = t[csere_2];
            t[csere_2] = tmp;
            
            
            for (int i = 0; i < HOSSZ; i++) {
                
                System.out.print(t[i] + "  ");
            }
            
         System.out.println("\n"+"A tömb "+csere_1+"  elemét" + " cserélte a "+csere_2+"  elemével");
        
        } else {
            
            tmp = t[csere_1];
            t[csere_1] = t[csere_2];
            t[csere_2] = tmp;
        
            
        for (int i = 0; i < HOSSZ; i++) {
                
                System.out.print(t[i] + "  ");
            }
            System.out.println("\n"+"A tömb "+csere_1+"  elemét" + " cserélte a "+csere_2+"  elemével");
        }
    }
}