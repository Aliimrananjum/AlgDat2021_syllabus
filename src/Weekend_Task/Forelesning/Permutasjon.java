package Weekend_Task.Forelesning;

import Weekend_Task.Kap_1_2.Tabell;

import java.util.Arrays;

public class Permutasjon {

    public static void recursive_permutasjon(int [] a, int k){
        if(k == a.length){
            System.out.println(Arrays.toString(a));
        }

        for(int i = k; i<a.length; i++){

            Tabell.bytt(a,i,k);
            recursive_permutasjon(a,k+1);
            Tabell.bytt(a,i,k);
        }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3};

        System.out.println("");
        recursive_permutasjon(a,0);
    }
}
