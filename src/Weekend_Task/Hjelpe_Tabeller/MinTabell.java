package Weekend_Task.Hjelpe_Tabeller;


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
}


