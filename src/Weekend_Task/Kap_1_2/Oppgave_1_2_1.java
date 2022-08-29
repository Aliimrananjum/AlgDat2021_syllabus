package Weekend_Task.Kap_1_2;

public class Oppgave_1_2_1 {

    /* /oppgave 1. Lager disse og legger dem i en klasse tabell

    //jobber i halvåpnet interavll
    public static int min1(int[]a, int fra, int til){

        int m = fra;
        int minstverdi = a[fra];

        for(int i = fra + 1; i < til; i++){
            if(a[i] < minstverdi){
                m = i;
                minstverdi = a[m];
            }
        }
        return m;
    }

    //jobber i lukket intervall
    public static int min2(int [] a, int venstre, int høyre){
        int m = venstre;
        int minstverdi = a[venstre];

        for(int i = venstre + 1; i <= høyre; i++){
            if(a[i] < minstverdi){
                m = i;
                minstverdi = a[m];
            }
        }
        return m;
    }
    }

     */

    public static void main(String[] args) {
        int [] a = {4,5,7,2,22,5,55,21,65,2,13};
        int min1 = Tabell.min1(a,4,9);
        int min2 = Tabell.min2(a,4,9);
        System.out.println(min1);
        System.out.println(min2);
    }
}

