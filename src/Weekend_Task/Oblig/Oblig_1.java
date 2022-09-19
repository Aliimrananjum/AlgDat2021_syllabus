package Weekend_Task.Oblig;

public class Oblig_1 {
/* Oppgave 5

    char temp = a[a.length-1];
        System.arraycopy(a,0,a,1,a.length-1);
    a[0] = temp;

 */
/*
    public static void boblesortering(int[] a)     // hører til klassen Tabell
    {
        for (int n = a.length; n > 1; n--)           // n reduseres med 1 hver gang
        {
            for (int i = 1; i < n; i++)                // går fra 1 til n
            {
                if (a[i - 1] > a[i]) Tabell.bytt(a, i - 1, i);  // sammenligner/bytter
            }
        }
    }

    public static void main(String[] args) {

        int [] a = {6,10,16,11,7,12,3,9,8,5};
        int [] b = new int[a.length];
        int [] c = new int[a.length];

        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));


        for(int n = b.length; n > 1; ){
            int byttindeks = 0;
            for(int i = 1; i < n; i++){
                if(b[i-1] > b[i]){
                    int temp = b[i-1];
                    b[i-1] = b[i];
                    b[i] = temp;
                    byttindeks = i;
                }
            }
            n = byttindeks;

        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length; j++){
                if(b[i] == a[j]){
                    c[i] = j;
                }
            }
        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length; j++){
                if(b[i] == a[j]){
                    c[i] = j;
                }
            }
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));



    }

 */

    //oppgave 6

    public static void main(String[] args) {

        int i = -2;
        int n = 17;

        if((i %=n) < 0 ){
            System.out.println("i løkken " + i);
        }
        else{
            System.out.println(i);
        }







    }
}
