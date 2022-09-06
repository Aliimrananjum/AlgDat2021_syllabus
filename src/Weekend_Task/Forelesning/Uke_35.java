package Weekend_Task.Forelesning;

public class Uke_35 {

    public static int maks(int []a, int fra, int til){
        int mix = fra;
        int maksverdi = a[fra];
        for(int i = fra + 1; i < til; i++){
            if(a[i] > maksverdi){
                mix = i;
                maksverdi = a[mix];
            }
        }
        return mix;
    }

    public static void bytt(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sortering(int[] a){
        for (int i = a.length; i>1; i--){
            int mix = maks(a,0,i);
            bytt(a,i-1,mix);
        }
    }

    //oppgave 1.2.4-2
    //lag en algoritme som returnerer indeks til største og nest største verdi
    //ved hjelp av maks og bytt
}
