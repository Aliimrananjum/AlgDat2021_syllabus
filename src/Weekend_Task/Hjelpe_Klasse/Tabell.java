package Weekend_Task.Hjelpe_Klasse;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {

    //Programkode 1.2.3 a) Fra til kontroll. Tester om det er halvåpne tabellintervallet er lovlig
    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    //Programkode 1.2.3 d
    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }
    public static int min1(int[] a, int fra, int til) {

        int m = fra;
        int minstverdi = a[fra];

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minstverdi) {
                m = i;
                minstverdi = a[m];
            }
        }
        return m;
    }

    public static int min2(int[] a, int venstre, int høyre) {
        int m = venstre;
        int minstverdi = a[venstre];

        for (int i = venstre + 1; i <= høyre; i++) {
            if (a[i] < minstverdi) {
                m = i;
                minstverdi = a[m];
            }
        }
        return m;
    }

    //henter kode fra 1.1.8 d
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //1.1.8 e
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k + 1);        // en tilfeldig tall fra 0 til k
            bytt(a, k, i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    //1.1.8 f

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    //1.2.1b med paramenterverditest for oppgave 1.2.3 3)

    public static int maks(int[] a, int fra, int til) {

        //Tester parameteren a og som gir en feilmelding hvis a er null
        if(a == null){
            throw new NullPointerException("Array er Null! Skjerp deg!");
        }

        fratilKontroll(a.length,fra,til);

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");




        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    //1.2.1c
    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);     // kaller metoden over
    }

    //fra oppgave 1.2.2 3)

    public static void bytt(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    //oppgave 1.2.2 4)
    public static void skriv1(int[] a, int fra, int til) {

        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i < til - 1) {
                System.out.print("-");
            }
            if(i == til -1){
                System.out.print("\n");
            }
        }
    }

    //fra fasit

    public static void skriv(int[] a, int fra, int til)
    {
        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }

    public static void skriv(int[] a)
    {
        skriv(a, 0, a.length);
    }

    public static void skriv2(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print("-");
            }
        }

    }

    //oppgave 1.2.2 5)

    public static void skriv1medlinjeskift(int[] a, int fra, int til) {

        int m = fra;

        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i < til - 1) {
                System.out.print("-");
            }
            if(i == til -1){
                System.out.print("\n");
            }
        }
    }

    public static void skriv2medlinjeskift(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print("-");
            }
            if(i == a.length -1){
                System.out.print("\n");
            }
        }
    }

    //fra fasit

    public static void skrivln(int[] a, int fra, int til)
    {
        skriv(a,fra,til);
        System.out.println();
    }

    public static void skrivln(int[] a)
    {
        skrivln(a, 0, a.length);
    }

    //1.2.2 oppgave 6

    public static void skrivChar1(char[] a, int fra, int til) {

        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i < til - 1) {
                System.out.print("-");
            }
            if(i == til -1){
                System.out.print("\n");
            }
        }
    }

    public static void skrivChar2(char[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print("-");

            }
        }

    }

    //oppgave 1.2.2 5)

    public static void skrivChar1medlinjeskift(char[] a, int fra, int til) {

        int m = fra;

        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i < til - 1) {
                System.out.print("-");
            }
            if(i == til -1){
                System.out.print("\n");
            }
        }
    }

    public static void skrivChar2medlinjeskift(char[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print("-");
            }
            if(i == a.length -1){
                System.out.print("\n");
            }
        }
    }

    //oppgave 1.2.2 5)
    public static int[] naturligeTall(int n){
        return Weekend_Task.Kap_1_2.Tabell.randPerm(n);
    }

    //eller i følge fasit. Det er for en vanlig tallrekke

    public static int[] naturligeTallFasit(int n){
        if( n < 1) throw new IllegalArgumentException("n(" + n + ") er mindre enn 1!");
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = i +1;
        }
        return a;
    }

    public static int[] heleTall(int n, int fra, int til){
        if(fra > til) throw new IllegalArgumentException("Fra (" + fra + ") er større enn til!");
        int m = fra;
        int [] a = new int[til - fra];
        for(int i = fra; i < til; i++){
            a[i - fra] = i;
        }
        return a;
    }

    //For oppgave 1.2.3 3)


    //for oppgave 1.2.4-1
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks


    //for oppgave 1.2.4-2
    public static int[] nestMaksBytt(int[] a)
    {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Weekend_Task.Kap_1_2.Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Weekend_Task.Kap_1_2.Tabell.bytt(a,0,m);  // bytter om slik at den største kommer forrest

        int k = Weekend_Task.Kap_1_2.Tabell.maks(a,1,a.length);

        if (k == m) k = 0; // den nest største lå opprinnelig forrest

        Weekend_Task.Kap_1_2.Tabell.bytt(a,0,m); // bytter tilbake

        return new int[] {m,k};

    } // nestMaks

    public static int[] nestMaksBakerst(int[] a)
    {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Weekend_Task.Kap_1_2.Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Weekend_Task.Kap_1_2.Tabell.bytt(a,a.length-1,m);  // bytter om slik at den største kommer bakerst

        int k = Weekend_Task.Kap_1_2.Tabell.maks(a,0,a.length-1);

        if (k == m) k = a.length - 1; // den nest største lå opprinnelig bakerst

        Weekend_Task.Kap_1_2.Tabell.bytt(a,a.length-1,m); // bytter tilbake

        return new int[] {m,k};

    } // nestMaks

    //for oppgave 1.3.1 a)

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

    //Programkode 1.3.4 a)
    public static void utvalgssortering(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min1(a, i, a.length));  // to hjelpemetoder
    }

    //oppgave 9) Lag utvalgssortering som sorterer intervallet a[fra:til>
    public static void utvalgssortering(int [] a,int fra, int til){
        Tabell.fratilKontroll(a.length,fra,til);
        for(int i = fra; i < til-1; i++){
            Tabell.bytt(a,i,Tabell.min1(a,i,til));
        }
        Tabell.skriv2(a);
    }

    //Programkode 1.3.6 a)

    public static int binærsøkV1(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v <= h)    // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;      // heltallsdivisjon - finner midten
            int midtverdi = a[m];   // hjelpevariabel for midtverdien

            if (verdi == midtverdi) return m;          // funnet
            else if (verdi > midtverdi) v = m + 1;     // verdi i a[m+1:h]
            else  h = m - 1;                           // verdi i a[v:m-1]
        }

        return -(v + 1);    // ikke funnet, v er relativt innsettingspunkt
    }

    public static int binærsøk(int[] a, int verdi)  // søker i hele a
    {
        return binærsøkV1(a,0,a.length,verdi);  // bruker metoden over
    }

    public static int binærsøkV2(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;    // v og h er intervallets endepunkter

        while (v <= h)  // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;     // heltallsdivisjon - finner midten
            int midtverdi = a[m];  // hjelpevariabel for  midtverdien

            if (verdi > midtverdi) v = m + 1;        // verdi i a[m+1:h]
            else if (verdi < midtverdi) h = m - 1;   // verdi i a[v:m-1]
            else return m;                           // funnet
        }

        return -(v + 1);   // ikke funnet, v er relativt innsettingspunkt
    }

    public static int binærsøkV3(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v < h)  // obs. må ha v < h her og ikke v <= h
        {
            int m = (v + h)/2;  // heltallsdivisjon - finner midten

            if (verdi > a[m]) v = m + 1;   // verdi må ligge i a[m+1:h]
            else  h = m;                   // verdi må ligge i a[v:m]
        }
        if (h < v || verdi < a[v]) return -(v + 1);  // ikke funnet
        else if (verdi == a[v]) return v;            // funnet
        else  return -(v + 2);                       // ikke funnet
    }

}
