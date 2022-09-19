package Weekend_Task.Kap_1_4;

import Weekend_Task.Hjelpe_Klasser.Komparator;
import Weekend_Task.Hjelpe_Klasser.Person;
import Weekend_Task.Hjelpe_Klasser.Student;
import Weekend_Task.Hjelpe_Klasser.Studium;
import Weekend_Task.Hjelpe_Tabeller.Sortering;
import Weekend_Task.Kap_1_2.Tabell;

import java.util.Arrays;

public class Oppgave_1_4_6 {

    public static void main(String[] args) {

        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen

        Student[] s = new Student[5];                             // en studenttabell
        s[0] = new Student("Kari","Svendsen", Studium.Data);      // Kari Svendsen
        s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
        s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
        s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
        s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen

        Integer [] o = {1,3,4,5,7,2,8,9,10,6};


        String [] test = {"Data","IT","Anvendt"};
        Sortering.innsettningssortering(test);
        System.out.println("Tester med bokstaver");
        System.out.println(Arrays.toString(test));

        class FornavnKomparator implements Komparator<Person>{
            public int compare(Person p1, Person p2){
                return p1.fornavn().compareTo(p2.fornavn());
            }
        }

        /*
        //Komparator<Person> c = new FornavnKomparator();
        Sortering.innsettingssortering(s,(s1,s2) ->{
            int k = s1.studium().compareTo(s2.studium());
            return k != 0 ? k : s1.compareTo(s2);
        });
        for (Student t : s) System.out.println(t);

         */

        Komparator<Integer> d = (x,y) ->
        {
            if(x % 2 ==0 && y%2 ==0){ //begge er partall
                return 0;
            }
            else if(x % 2 !=0 && y%2 !=0){//begge er oddetall
                return 0;
            }
            else if( x % 2 > y % 2) {
                return 1;
                //x er oddetall y er partall
            }
            else if(y % 2 > x % 2){ // y er oddetall x er partall
                return -1;
            }
            return 0;
        };

        //oppgave 3

        System.out.println(s[0].studium().ordinal());


        Komparator<Student> g = (s1,s2) ->{
            int k = s1.studium().toString().compareTo(s2.studium().toString());
            if(k !=0){
                return k;
            }
            k = s1.fornavn().compareTo(s2.fornavn());
            if( k != 0){
                return k;
            }
            return s1.etternavn().compareTo(s2.etternavn());
        };
        Sortering.innsettingssortering(s,g);

        System.out.println("For oppgave 3:");
        System.out.println(Arrays.toString(s));

        Sortering.innsettingssortering(o,d);
        System.out.println(Arrays.toString(o));

        //oppgave 5

        String [] t = {"21","18","8","13","20","6","16","25","3","10"};
        Sortering.innsettingssortering(t,(x,y) ->{
            int k = x.length() - y.length();
            if(k!=0){
                return k;
            }
            else{
                return x.compareTo(y);
            }
        });

        System.out.println("For oppgave 5 ");
        System.out.println(Arrays.toString(t));

    }


}
