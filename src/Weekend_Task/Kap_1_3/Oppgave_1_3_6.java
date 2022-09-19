package Weekend_Task.Kap_1_3;

import Weekend_Task.Hjelpe_Tabeller.Tabell;

public class Oppgave_1_3_6 {
    public static void main(String[] args) {
        int [] a ={ 1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
        System.out.println(Tabell.binærsøkV1(a,0,a.length,7)
        );
        System.out.println(Tabell.binærsøkV3(a,0,17,7));

        // v1 og v3 den finner posisjon til den som er nærmest midten.
        // v3 returnerer  alltid indeksen til den første av dem hvis søkeverdien det søkes forekommer flere ganger.
    }


}
