package Weekend_Task.Kap_1_3;

import Weekend_Task.Hjelpe_Klasse.Tabell;

public class Oppgave_1_3_8 {

    //Programkode 1.3.8 a)

    public static void main(String[] args) {
        int[] a = {3,5,6,10,10,11,13,14,16,20,0,0,0,0,0};  // en tabell
        int antall = 10;                                   // antall verdier

        if (antall >= a.length) throw new IllegalStateException("Tabellen er full");

        int nyverdi = 10;                                  // ny verdi
        int k = Tabell.binærsøkV3(a, 0, antall, nyverdi);    // søker i a[0:antall>
        if (k < 0) k = -(k + 1);                           // innsettingspunkt

        System.arraycopy(a,k,a,k+1,antall-k);


        a[k] = nyverdi;                                    // legger inn
        antall++;                                          // øker antallet

        Tabell.skrivln(a, 0, antall);  // Se Oppgave 4 og 5 i Avsnitt 1.2.2

        //Programkode 1.3.8 a)
    }
}
