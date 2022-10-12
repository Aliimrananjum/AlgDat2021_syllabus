package Weekend_Task.Kap_1_5;

public class Oppgave_1_5_1 {

    //opppgave 1

    public static int a(int n)           // n et ikke-negativt tall
    {
        if (n < 0) throw new IllegalArgumentException("n er negativ!");

        int x = 0, y = 1, z = 1;

        for (int i = 0; i < n; i++)
        {
            z = 2*y + 3*x;
            x = y;
            y = z;
        }
        return z;
    }

    public static int tverrsum(int n){
        if (n < 0) throw new IllegalArgumentException("n er negativ!");
        int sum = 0;
        while (n > 0){
            sum += n %10;
            n = n/10;
        }

        return sum;
    }

    public static int sifferrot(int n){
    while (n>=10){
        n = tverrsum(n);
    }
    return n;
    }

    //Oppgave 10

    public static int fakultet(int n){
        if(n == 0){
            return 1;
        }
        else{
           return n*fakultet(n-1);
        }
    }

    public static int fib(int n){
        if(n <=1){
            return n;
        }
        else return fib(n-1) +fib(n-2);
    }


    public static void main(String[] args) {
        System.out.println("Oppgave 3: " + tverrsum(22));

        System.out.println("Oppgave 5: " + sifferrot(956847));

        System.out.println("Oppgave 10: " + fakultet(5));

        System.out.println("Oppgave 11: " + fib(30));
    }
}
