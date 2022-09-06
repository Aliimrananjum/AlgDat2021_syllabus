package Weekend_Task.Kap_1_2;


public class Oppgave_1_2_4 {

    /*
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivln(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
    }

     */

    public static void main(String[] args) {
        Tabell.nestMaksBytt(Tabell.randPerm(10));
    }
}
