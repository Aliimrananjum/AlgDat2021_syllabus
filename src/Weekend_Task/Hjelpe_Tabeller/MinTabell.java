package Weekend_Task.Hjelpe_Tabeller;


import java.util.Arrays;

//klasse over mine egne metoder
public class MinTabell {

    public static int min(int [] a){ //finne posisjon til minste verdi
        if(a.length < 1){
            throw new ArrayIndexOutOfBoundsException("Tabellen er tom!");
        }
        int minverdi = 0;

        for(int i = 1; i < a.length; i++){
            if(a[i] < a[minverdi]){
                minverdi = i;
            }
        }
        return minverdi;
    }

    //lager en maks metode for double. Returnerer maks index.
    public static int maksDouble(double [] a){
        int mi = 0;
        double mv = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > mv){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    //maks metode for string

    public static int maksString(String[] a){
        int mi = 0;
        String mv = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i].compareTo(mv) > 0){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    public static int maksInt(int [] a ){
        int mi = 0;
        double mv = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > mv){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    public static int maksChar(char [] a){
        int mi = 0;
        int mv = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > mv){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    public static int maksInteger(Integer [] a){
        int mi = 0;
        int mv = a[0];

        for(int i = 1; i < a.length; i ++){
            if(a[i].compareTo(mv) > 0){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    public static <T extends  Comparable<? super T>> int maksGeneric(T[] a){
        int mi = 0;
        T mv = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i].compareTo(mv) > 0){
                mv = a[i];
                mi = i;
            }
        }
        return mi;
    }

    public static <T extends Comparable<? super T>> void innsettningssorteringGeneric(T [] a){

        for(int i = 1; i < a.length; i++){
            T verdi =a[i];
            int j = i -1;
            for(; j>= 0 && verdi.compareTo(a[j]) < 0; j--){
                a[j+1] =a[j];
            }
            a[j + 1] = verdi;// hva skjer her? er den påvirket av j--?
        }
    }

    public static void skrivObject(Object [] a, int fra, int til){
        int j = fra;
        int k = til;
        for(int i = j; i < k; i++){
            if(i == j){
                System.out.print(a[i]);
            }
            System.out.print("-"+ a[i]);
        }
    }

    public static void skrivHeleObject(Object [] a){
        for(int i = 0; i < a.length; i++){
            if(i == 0){
                System.out.print(a[i]);
            }
            System.out.print("-"+ a[i]);
        }
    }
    public static void skrivLnObject(Object [] a, int fra, int til){
        int j = fra;
        int k = til;
        for(int i = j; i < k; i++){
            if(i == j){
                System.out.print(a[i]);
            }
            else if(i != k-1){
                System.out.print("-"+ a[i]);
            }
            else{
                System.out.print("-"+ a[i]);
                System.out.println("");
            }
        }
    }

    //usortert søk

    public static int usortertSøk(int [] a, int value){
        for(int i = 0; i <a.length; i++){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int sortertsøk(int [] a, int values){
        //poenget med sortert liste er at man kan hoppe frem flere hakk.
        // på den måten slipper man å søke gjennom alle elementer.
        int step_lenght = 2;
        for(int i = 0; i < a.length; i = i +step_lenght){
            if(a[i] >= values){
                int begin = i - step_lenght;
                int end = i + 1;
                for(int j = begin; j < end; j++){
                    if(a[j] == values){
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    public static int binærsøk(int [] a, int fra, int til, int values){
        int v = fra;
        int h = til -1;
        while (v <=h){
            int m = (v+h)/2;
            int midtverdi = a[m];
            if(values == midtverdi){
                return m;
            }
            else if(values > midtverdi){
                v = m+1;
            }
            else{
                h = m-1;
            }
        }
      return -(v+1);
    }

    //Rep: Quicksort

    //lager først en bytt pivot metode
    public static int byttPivotBakerst(int [] a, int fra, int til){
        int midten = (til + fra)/2;
        int temp = a[midten];
        a[midten] = a[til-1];
        a[til-1] = temp;

        return a[til-1];
    }

    //vanlig bytt
    public static void bytt(int [] a, int fra , int til){
        int temp = a[fra];
        a[fra] = a[til];
        a[til] = temp;
    }
    //lager en partisjon metode
    public static int partisjoner(int a [], int pivot, int fra, int til){
        if(a.length <1){
            throw new ArrayIndexOutOfBoundsException("Tom tabell");
        }

        while( fra < til && a[fra] < pivot){
            fra ++;
        }
        while (fra < til && a[til-1] >= pivot){
            til --;
        }

        if(fra < til){
            bytt(a,fra,til);
            fra ++;
            til --;
        }

        return til;
    }

    public static void quicksortMain(int [] a, int fra, int til){
        if(fra >= til) return;
        int pivot = byttPivotBakerst(a,fra,til);
        int sisteIndex = partisjoner(a,pivot,fra,til);
        bytt(a,sisteIndex,til-1);//bytter mellom siste index og pivot
        quicksortMain(a,fra,sisteIndex-1);
        quicksortMain(a,sisteIndex+1,til);

    }

    public static void quciksort(int [] a){
        quicksortMain(a,0,a.length);
    }

    public static void main(String[] args) {
        int [] a = {4,2,8,44,22,1,9,10,34,63};
        quciksort(a);
        System.out.println(Arrays.toString(a));

    }


}


