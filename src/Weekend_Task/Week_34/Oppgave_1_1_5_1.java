package Weekend_Task.Week_34;

/*

1.	Sjekk at Programkode 1.1.5 gir korrekte resultater.
Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
Se også Avsnitt 1.1.7.

Svar: med en lengte er resultatet 0, med tom mengde får vi outofbounceexception.
 */

public class Oppgave_1_1_5_1 {

    public static int maks(int[] a){
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
        int[] a= {5,7,2,10,9,1,3,8,4,6};
        System.out.println(maks(a));
    }

}
