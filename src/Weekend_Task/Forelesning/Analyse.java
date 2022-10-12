package Weekend_Task.Forelesning;

public class Analyse {

    public static int maks(int [] a){
        int maks_verdi = a[0];
        for(int i = 1; i < 7; i++){
            int verdi = a[i];
            if(verdi > maks_verdi){
                maks_verdi = verdi;
            }
        }
        return maks_verdi;
    }

    public static void main(String[] args) {
        int liste [] = {16,3,8,19,22,7,26};

    }
}
