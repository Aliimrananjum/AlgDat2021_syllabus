package Weekend_Task.Kap_1_3;
import Weekend_Task.Hjelpe_Tabeller.Tabell;


public class Oppgave_1_3_4 {

    //oppgave 3)
    public static void main(String[] args) {

        int[] a = {7,5,9,2,10,4,1,8,6,3};     // en usortert heltallstabell
        /*
        Tabell.utvalgssortering(a);           // stigende sortering
        Tabell.snu(a);                        // tabellen snus
        Tabell.skriv(a);                      // 10 9 8 7 6 5 4 3 2 1

        //det funker

         */
        utvalgssortering(a,0,10);
    }

    //oppgave 9) Lag utvalgssortering som sorterer intervallet a[fra:til>
    public static void utvalgssortering(int [] a,int fra, int til){
        Tabell.fratilKontroll(a.length,fra,til);
        for(int i = fra; i < til-1; i++){
            Tabell.bytt(a,i,Tabell.min1(a,i,til));
        }
        Tabell.skriv2(a);
    }

}
