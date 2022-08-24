package Weekend_Task.Week_34;


import java.util.Arrays;

//Lag en metode public static int[] minmaks(int[] a).
// Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a.
// Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:
// int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?

public class Oppgave_1_1_3_5 {

    public static int[] minmaks(int[]a){

        int m1 = 0;
        int m2 = 0;

        for(int i = 1; i < a.length; i++){ // n sammenligninger
            if(a[i] > a[m1]) {  //finner posisjon til største verdi. (n-1) sammenligninger
                m1=i;
            }
            if(a[i] < a[m2]){ //finner posisjon til laveste verdi (n-1) sammenligninger
                m2=i;
            }
        }

        //Det er 3n-2 sammenligninger

        int[] b = {m1,m2};

        return b;
    }

    public static void main(String[] args) {
        int[] a= {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println(Arrays.toString(minmaks(a)));
    }
}
