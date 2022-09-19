package Weekend_Task.Kap_1_4;

import Weekend_Task.Hjelpe_Tabeller.MinTabell;
import Weekend_Task.Hjelpe_Tabeller.Tabell;

public class Oppgave_1_4_3 {

    public static void main(String[] args) {
        Object [] a = {1,2,4,6,7,8,8,4,3,3,2};
        MinTabell.skrivLnObject(a,0,a.length);
        System.out.println("test");

        MinTabell.skrivHeleObject(Tabell.randPermInteger(20));;
    }

    /*
    Oppgave 8
_
Hvis du har tilgang til begge metodene i et program, vil metodekallet f(1,1); føre til at kompilatoren gir en feilmelding som denne: Reference to f is ambiguous. Both method f(int,Integer) og method f(Integer,int) match. Det kommer av at hvis den første f-en skal brukes, må det andre 1-tallet konverteres til en Integer. Hvis derimot den andre f-en skal brukes, må de første 1-tallet konverteres til en Integer. Det ene er ikke noe riktigere enn det andre. Derfor er det tvetydig.

Hvis en av metodene tas vekk, vil metodekallet f(1,1); bli utført. Det er det samme hvilken som tas vekk.

En kan bestemme hvem av dem som skal brukes ved å konvertere ett av tallene til en Integer:

  f(1, (Integer)1);  // nå brukes f(int a, Integer b)
  f((Integer)1,1);   // f(Integer a, int b)
     */
}
