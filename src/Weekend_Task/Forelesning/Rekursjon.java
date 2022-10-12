package Weekend_Task.Forelesning;

public class Rekursjon {


    //binærsøk
    public static int binærsøk(int [] a, int verdi){
        return binærsøk(a,verdi,0,a.length-1);
    }
    public static int binærsøk(int [] a, int verdi, int v, int h){
        int midten = (v+h)/2;
        if(v == h){
            if(verdi == a[v]){
                return v;
            }
            else{
                return -(v +1);
            }
        }
        if(verdi >= a[midten]){
            if(verdi == a[midten]){
                return midten;
            }
            return binærsøk(a,verdi,midten+1, h);
        }
        else{
            return binærsøk(a,verdi,v, midten-1);
        }
    }

    public static void main(String[] args) {
        int [] a = {1,5,6,8,9,10,14,31,40};

        System.out.println(binærsøk(a,14));
    }

}
