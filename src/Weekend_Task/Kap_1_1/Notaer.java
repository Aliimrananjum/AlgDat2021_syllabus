package Weekend_Task.Kap_1_1;

import java.util.Arrays;

public class Notaer {

    //25.08
    //Finn index med høyest verdi i halvåpent intervall
    //sorter tabellen

    public static int maks(int[] a, int fra, int til) {
        int maksindex = fra;
        int maksverdi = a[maksindex];


        for(int i = fra +1; i< til; i++){
            if(a[i] > maksverdi){
                maksverdi = a[i];
                maksindex =i;

            }
        }
        return maksindex;

    }

    //oppgave 1.2.4-4

    public static void bytt(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void main(String[] args) {
        int a [] ={4,1,7,999,12};

        //main metode
        for(int k = a.length; k > 1; k--){
            int maksindex = maks(a,0,k);
            bytt(a,k-1,maksindex);
        }
        System.out.println(Arrays.toString(a));
    }

}
