package Weekend_Task.Week_34;

//Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
//long fak(int n) som regner ut n! . Hvor mange multiplikasjoner utføres i metoden?
public class Oppgaver_1_1_3_6 {

    public static long fak(int n){
       int fak = n;
       int sum = 1;

       for(int i = 1; i <= n; i++){
           sum *= fak;
           --fak;
       }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(fak(3));

    }
}
