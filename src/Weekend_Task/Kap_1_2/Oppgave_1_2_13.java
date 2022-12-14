package Weekend_Task.Kap_1_2;

public class Oppgave_1_2_13 {

    //oppgave 3
    public static int[] nestMaks(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2*n];          // turneringstreet
        System.arraycopy(a,0,b,n,n);     // legger a bakerst i b

        for (int k = 2*n-2; k > 1; k -= 2)   // lager turneringstreet
            b[k/2] = Math.max(b[k],b[k+1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2)
        {
            int tempverdi = b[k+1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        Tabell.skriv2medlinjeskift(b);

        return new int[] {maksverdi,nestmaksverdi}; // størst og nest størst

    } // nestMaks

    //oppgave 1.2.13 3)
    public static void kopier(int [] a, int i, int[] b, int j, int ant){
        for(int n = i; n <ant;){
            b[j++] = a[n++];
            ;
        }
    }


    public static void main(String[] args) {
        int [] a = {3,4,6,2,1,10,76,9};
        int [] b = new int[2 * a.length];
        int [] c = new int[2 * a.length];
        int [] d = new int[2 * a.length];


        kopier(a,0,b,a.length, a.length);
        kopier(a,0,c,0, a.length);
        kopier(a,0,d,(a.length/2),a.length);
        System.out.println("Bakerst:");
        Tabell.skriv(b);
        System.out.println("");
        System.out.println("Forran:");
        Tabell.skriv(c);

        System.out.println("");
        System.out.println("Midten:");
        Tabell.skriv(d);

    }


}
