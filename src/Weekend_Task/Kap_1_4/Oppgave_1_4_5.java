package Weekend_Task.Kap_1_4;

import Weekend_Task.Hjelpe_Klasser.Måned;
import Weekend_Task.Hjelpe_Klasser.Student;
import Weekend_Task.Hjelpe_Klasser.Studium;
import Weekend_Task.Hjelpe_Tabeller.Sortering;

public class Oppgave_1_4_5 {
    public static void main(String[] args) {

        Student[] s = new Student[5];  // en Studenttabell

        s[0] = new Student("Kari", "Svendsen", Studium.Data);    // Kari Svendsen
        s[1] = new Student("Boris", "Zukanovic", Studium.IT);    // Boris Zukanovic
        s[2] = new Student("Ali", "Kahn", Studium.Anvendt);      // Ali Kahn
        s[3] = new Student("Azra", "Zukanovic", Studium.IT);     // Azra Zukanovic
        s[4] = new Student("Kari", "Pettersen", Studium.Data);   // Kari Pettersen

        Sortering.innsettingssortering(s);                     // Programkode 1.4.2 e)
        for (Student t : s) System.out.println(t);

        //oppgave 3

        for(Måned m : Måned.sommer()){
            System.out.println(m.toString()+ "(" + m.name() + ")" + m.mndnr() );
        }

    }
}
