package Weekend_Task.Kap_1_2;

import java.util.Arrays;

public class Turneringstrær {

    //en måte å regne ut hvem som vinner. Et datakonstruktør utenom array.

    public static void main(String[] args) {
        int [] a= {0,0,0,0,0,0,2,9,8,6,5,3};
        int begin = 5; // skal finne ut hvem som vinner i id 5 i et turneringstrær
        for(int i = begin; i > 0; --i){ //
            int id = i; // 5
            int left = 2*id; // finner verdi i id 10
            int right = 2*id + 1; // finner verdi i id 11.
            if(a[left] > a[right]){
                a[id] = a[left];
            }
            else{
                a[id] = a[right];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
