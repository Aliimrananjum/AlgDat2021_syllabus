package Weekend_Task.Kap_1_4;

import Weekend_Task.Hjelpe_Klasser.Person;
import Weekend_Task.Hjelpe_Tabeller.MinTabell;
import Weekend_Task.Hjelpe_Tabeller.Sortering;
import Weekend_Task.Hjelpe_Tabeller.Tabell;

import java.util.Arrays;

public class Oppgave_1_4_4 {

    public static void main(String[] args) {
        Person[] p = new Person[5];

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen

        int m = MinTabell.maksGeneric(p);

        System.out.println(p[m] + " er størst");

        Sortering.innsettingssortering(p);
        System.out.println(Arrays.toString(p));
    }

}
