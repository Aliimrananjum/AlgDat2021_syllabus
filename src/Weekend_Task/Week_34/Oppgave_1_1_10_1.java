package Weekend_Task.Week_34;

import java.util.Random;

public class Oppgave_1_1_10_1 {

    public static int[] randPerm(int n)  // en versjon som ikke virker
    {
        Random r = new Random();      // en randomgenerator
        int[] a = new int[n];         // en tabell med plass til n tall

        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(n) + 1;    // tabellen fylles med tall

        return a;                     // tabellen returneres
    }

    public static int konstnader(int[] a) {
        int m=0;
        for(int i = 1; i<a.length;i++){}
        return m;
    }

    public static int maks1(int[] a)
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > a[m]) m = i;
        }

        return m;
    }

    public static int maks2(int[] a)
    {
        int m = 0;
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];
            m = i;
        }
        return m;

    }

    public static int maks3(int[] a){
        int sist = a.length-1;
        int m = 0;
        int maksverdi = a[0];
        int temp =a[sist];
        a[sist] =0x7fffffff;  // legger tallet 2147483647 sist

        for(int i = 0;;i++){
            if(a[i] >=maksverdi){
                if(i==sist){
                    a[sist] = temp;
                    return temp >=maksverdi ? sist :m; // er siste størst?
                }
                else{
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 200_000, antall = 2_000;
        long tid = 0;
        int a[] = randPerm(n);

        tid =System.currentTimeMillis();
        for(int i = 0; i < antall; i++) konstnader(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Faste kostnader: " + tid +" millisek");

        tid = System.currentTimeMillis();
        for(int i = 0; i < antall; i++) maks1(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Maks1-metode: " + tid +" millisek");

        tid = System.currentTimeMillis();
        for(int i = 0; i < antall; i++) maks2(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Maks2-metode: " + tid +" millisek");

        tid = System.currentTimeMillis();
        for (int i = 0; i < antall; i++) maks3(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Maks3-metoden: " + tid + " millisek");
    }
}
