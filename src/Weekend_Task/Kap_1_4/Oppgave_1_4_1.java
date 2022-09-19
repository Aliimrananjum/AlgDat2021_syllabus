package Weekend_Task.Kap_1_4;

import Weekend_Task.Hjelpe_Tabeller.MinTabell;

public class Oppgave_1_4_1 {

    //oppgave 1, 2
    public static void main(String[] args) {
        char [] c = "JASMIN".toCharArray();
        int[] a = {5,2,7,3,9,1,8,4,6};
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        Integer [] i = {5,2,7,3,9,1,8,4,6};

        int k = MinTabell.maksInt(a);     // posisjonen til den største i a
        int l = MinTabell.maksDouble(d);     // posisjonen til den største i d
        int m = MinTabell.maksString(s);     // posisjonen til den største i s
        int g = MinTabell.maksChar(c);
        int h = MinTabell.maksInteger(i);

        System.out.println(a[k] + "  " + d[l] + "  " + s[m] + "  " + c[g] + "  " + i[h]);

        // tester med INTEGER

       //forstår ikke oppgave 4 Integer ta = a;

        //Oppgave 5

        String j  = "Ali";
        String o = "AlI";
        System.out.println("Oppgave 5 compareTo test: "  + j.compareTo(o));

        System.out.println(Boolean.compare(false, true)); // svaret er - 1;

    }
}
