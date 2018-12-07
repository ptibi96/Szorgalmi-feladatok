package szorgalmi_feladat_8;

/**
 *
 * @author Tibi
 */
public class Szorgalmi_feladat_8 {

    public static void main(String[] args) {

      /*FELADAT: Készítsünk algoritmust, mely megkeresi egy egészeket tartalmazó tömbben a leghosszabb növekvő számsort és kiírja annak a hosszát (az elemeit nem kell)!**/  
        
        int t[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21,     3};
        int novel = 0, db = 0;
        int ossz[] = new int[t.length];
        int vegso = Integer.MIN_VALUE;

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < t.length; i++) {

            if (i != t.length - 1) {

                if (t[i] < t[i + 1]) {

                    db++;
                    ossz[i] = db;

                } else {
                    ossz[i] = db;
                    db = 0;

                }

            } else {

                if (t[i - 1] < t[i]) {

                    db++;
                    ossz[i] = db;

                } else {

//                        System.out.println("kevesebb");
                    novel = 1;
                }

            }

        }

        for (int i = 0; i < ossz.length; i++) {
//            System.out.println(ossz[i]);
            if (vegso < ossz[i]) {
                vegso = ossz[i];
            }
        }

        vegso = vegso + novel;
        System.out.println("A leghosszabb növekvő számsor: " + vegso);
    }

}
