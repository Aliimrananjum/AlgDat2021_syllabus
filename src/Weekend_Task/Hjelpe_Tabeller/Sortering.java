package Weekend_Task.Hjelpe_Tabeller;

import Weekend_Task.Hjelpe_Klasser.Komparator;

import java.util.Arrays;

public class Sortering {

    //Kvikksort start

    public static int kvikkSortBytt(int [] a, int i, int j){  // retunrerer verdier i siste index
        if(a.length < 1){
            throw new ArrayIndexOutOfBoundsException("Tabellen er tom!");
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        return a[a.length-1];

    }

    public static int partisjoner(int [] a, int i, int fra, int til){ // paramenter: array som skal partisjoneres og skilleverdi
        if(a.length < 1){
            throw new ArrayIndexOutOfBoundsException("Tabellen er tom!");
        }

        while(fra < til && a[fra] < i){
            fra ++;
        }

        while(fra < til && a[til] >= i){
            til--;
        }

        if(fra < til){
            kvikkSortBytt(a,fra,til);
            fra ++;
            til --;

        }

        return til;

    }

    public static int [] kvikksort0(int[] a, int fra, int til){
        if(fra >= til)return a;
        int pivot = kvikkSortBytt(a,((fra + til)/2),til); // finner midterste verdi i array, legger den i siste index og retunrerer veriden.
        int six = partisjoner(a,pivot,fra,til-1);

        kvikkSortBytt(a,six,til);
        kvikksort0(a,fra,six);
        kvikksort0(a,six+1,til);

        return a;
    }

    public static void kvikksortering(int [] a){

        if(a.length > 1){
            kvikksort0(a,0,a.length-1);
        }
    }

    //KvikkSort Slutt

    public static void innsettningssortering(int [] a){
        for(int i = 1; i < a.length; i++){
            int verdi =a[i];
            int j = i -1;
            for(; j>= 0 && verdi < a[j]; j--){
                a[j+1] =a[j];
            }
            a[j + 1] = verdi;
        }
    }

    public static void innsettningssortering(String [] a){
        for(int i = 1; i < a.length; i++){
            String verdi =a[i];
            int j = i -1;
            for(; j>= 0 && verdi.compareTo(a[j]) < 0; j--){
                a[j+1] =a[j];
            }
            a[j + 1] = verdi;//

        }

    }

    //kvikksort
    public static int sPartere0(int[] a, int v, int h, int indeks){
        Tabell.bytt(a,indeks,h);
        int pos = sPartere0(a,v,h-1,a[h]);
        Tabell.bytt(a,pos,h);
        return pos;
    }


    public static void kvikksortering0(int [] a, int v, int h){
        if(v >= h){
            return;
        }
        int k = sPartere0(a,v,h,(v+h)/2);
        kvikksort0(a,v,k-1);
        kvikksort0(a,k+1,h);
    }
    //Nyeste kvikksort ferdig

    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a){
        for(int i = 1; i < a.length; i++){
            T verdi = a[i];
            int j = i - 1;
            for(; j >=0 && verdi.compareTo(a[j]) < 0; j--){
                a[j+1] = a[j];
            }
            a[j+1] = verdi;
        }
    }

    public static <T> void innsettingssortering(T[] a, Komparator<?super T> c){
        for(int i = 1; i < a.length; i++){
            T verdi = a[i];
            int j = i-1;

            for(; j >=0 && c.compare(verdi,a[j]) < 0; j--){
                a[j + 1] = a[j];
            }
            a[j+1] = verdi;
        }
    }

    public static void main(String[] args) {
        int [] a = {2,5,1};
        innsettningssortering(a);
        System.out.println(Arrays.toString(a));
    }



}
