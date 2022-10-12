package Weekend_Task.Kap_1_5;

public class Oppgave_1_5_2 {

    public static int euklid(int a, int b)
    {
        System.out.println("euklid(" + a + "," + b + ") starter!");
        if (b == 0) {
            System.out.println("euklid(" + a + "," + b + ") er ferdig!");
            return a;
        }
        int r = a % b;            // r er resten
        System.out.println("euklid(" + a + "," + b + ") er ferdig!");
        return euklid(b,r);       // rekursivt kall

    }

    public static void main(String[] args) {

        euklid(480,126);



    }
}
