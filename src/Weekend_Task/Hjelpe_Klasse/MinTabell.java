package Weekend_Task.Hjelpe_Klasse;
import java.util.*;


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

    public static int midtenAvArray(int [] a){
        if(a.length < 1){
            throw new ArrayIndexOutOfBoundsException("Tabellen er tom!");
        }

        return a.length/2;
    }

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

        while(fra < til && a[til-1] >= i){
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
        int pivot = kvikkSortBytt(a,((fra+til)/2),til); // finner midterste verdi i array, legger den i siste index og retunrerer veriden.
        int six = partisjoner(a,pivot,fra,til);
        kvikkSortBytt(a,six,til);
        kvikksort0(a,fra,six-1);
        kvikksort0(a,six+1,til);

        return a;
    }

    public static void kvikksortering(int [] a){
        kvikksort0(a,0,a.length-1);
    }


    public static void main(String[] args) {
        int [] a = {5,11,12,6,2,7,22};
        kvikksortering(a);
        System.out.println(Arrays.toString(a));
    }
}


