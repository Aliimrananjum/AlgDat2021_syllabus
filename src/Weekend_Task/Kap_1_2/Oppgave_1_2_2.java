package Weekend_Task.Kap_1_2;

import java.util.Arrays;

public class Oppgave_1_2_2 {

    //Oppgave 1 er lagt inn i klassen Tabell

    /*/Oppgave 2

    public static void main(String[] args) {
        int [] a = Tabell.randPerm(20);
        for(int k : a) System.out.print(k + " ");

        int m = Tabell.maks(a);
        System.out.println("\n Største verdi ligger på plass " + m);
    }

     */

    /*oppgave 3 legger den i Tabell klassen
     public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
     */

    /*/oppgave 4

    public static void main(String[] args) {
        Tabell.skriv1(Tabell.randPerm(30),4,20);
        System.out.println("");
        Tabell.skriv2(Tabell.randPerm(10));
    }

     */

    /*/oppgave 5

    public static void main(String[] args) {
        Tabell.skriv1medlinjeskift(Tabell.randPerm(10),2,9);
        Tabell.skriv2medlinjeskift(Tabell.randPerm(5));
        System.out.println("Ferdig");
    }

     */


    //oppgave 7
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Tabell.naturligeTall(20)));

    }



}
