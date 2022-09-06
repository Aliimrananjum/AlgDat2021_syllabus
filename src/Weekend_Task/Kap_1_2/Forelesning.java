package Weekend_Task.Kap_1_2;

public class Forelesning {

    /*/oversett turneringstreet til programkode

    public static void main(String[] args) {
        int [] a = Tabell.randPerm(20);
        int begin = 4; //siste tomme element i tabellen
        for(int i = begin; i > 0; i--){
            int id = i;
            int left = 2 * id;
            int right = 2*id +1;
            if(a[left] > a[right]){
                a[id] = a[left];
            }
            else{
                a[id] = a[right];
            }

        }
    }

     */

    //hvordan finne noder
    /*
    int parent(int id ){
        return id/2;
    }

    int siblig(int id){
        if(2*parent(id)==id){ //venstre barn
            return id +1;
        }
        else{
            return id -1;//høyre barn
        }
    }

    int uncle(int id){
        return siblig(parent(id))
    }

    int grandparent(int id){
        return parent(parent(id));
    }

     */

}
