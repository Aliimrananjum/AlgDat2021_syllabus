package Weekend_Task.Kap_1_3;

public class Oppgave_1_3_5 {


    //oppgave 3)
    //Programkode 1.3.5 b)
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = a.length-1; for( ; a[i] > verdi; i--);  // søker fra bakerst i array.

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

    public static void main(String[] args) {
        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};  // Figur 1.3.5 a)
        System.out.println(lineærsøk(a,30));              // utskrift: 10
        System.out.println(lineærsøk(a,31));              // utskrift: -11
        System.out.println(lineærsøkmedK(a,17,3));

    }

    //oppgave 5)

    public static int lineærsøkmedK(int [] a, int verdi, int k){
        int step_lenght = k;

        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0;
        for(; i < a.length; i=i+k){
            if(a[i] >= verdi){
                int begin = i - step_lenght;
                int end = i +1;
                for(int j = begin; j < end; j++){
                    if(a[j] == verdi){
                        return j;
                    }

                    }
                }
            }
            return -(i+1);
        };  // siste verdi er vaktpost

}
