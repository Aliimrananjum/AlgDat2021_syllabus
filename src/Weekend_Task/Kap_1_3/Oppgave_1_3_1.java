package Weekend_Task.Kap_1_3;
import Weekend_Task.Hjelpe_Tabeller.Tabell;

import static Weekend_Task.Hjelpe_Tabeller.Tabell.bytt;

public class Oppgave_1_3_1 {

    //Oppgave 1)
    //legger til følgende metoder i Tabell klassen:


//Programkode 1.3.1 a)
    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }

    //Programkode 1.3.1 b)

    public static boolean nestePermutasjon(int[] a)
    {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }

    public static void main(String[] args) {
        int [] a={2,3,1,6,5,4};
        nestePermutasjon(a);
        Tabell.skriv2(a);
    }

}
