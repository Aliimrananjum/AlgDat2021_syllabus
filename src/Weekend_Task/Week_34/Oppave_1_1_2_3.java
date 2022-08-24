package Weekend_Task.Week_34;

//Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
// Hva må endres for at den skal returnere posisjonen til den siste?

public class Oppave_1_1_2_3 {
    public static int max(int[]a){
        int m = 0;

        for(int i = 1; i < a.length;i++){
            if(a[i] >= a[m]) {
                m=i;
            }
        }
        return m;

    }
    public static void main(String[] args) {
        int[] a= {8,4,17,10,6,20,1,11,15,3,18,20,2,7,19};
        System.out.println(max(a));
    }
}