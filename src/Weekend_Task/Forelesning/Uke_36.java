package Weekend_Task.Forelesning;

public class Uke_36 {

    //funker bra om man har en usortet liste
    public static int sorterSøk1(int [] a, int value){
        for(int i = 0; i <a.length; i++){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }

    //lager bedre metode som funker til sortet liste.
    public static int sorterSøk2(int [] a, int value){
        int step_lenght = 2;

        for(int i=0; i<a.length; i=i+step_lenght){
            if(a[i]>= value){ // hvis vi har hoppet value, vil vi da sammenligne verdiene fra i - step_length.
                int begin = i -step_lenght;
                int end = i + 1;
                for(int j = begin; j < end; ++j){
                    if(a[j] == value){
                        return j;
                    }
                }
            }
        }
        return -1;

        //hvordan oppe dynamisk og effektivt. Binær søk. Sortert array
    }
}
