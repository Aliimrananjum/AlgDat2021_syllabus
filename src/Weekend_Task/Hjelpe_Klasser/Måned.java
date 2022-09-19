package Weekend_Task.Hjelpe_Klasser;

import java.util.Arrays;

public enum Måned {
//Lag enumtypen Måned. Den skal inneholde konstanter for hver måned (med tre bokstaver), JAN, FEB, . . . , NOV, DES.
    JAN(1, "Janauar"),
    FEB(2, "Februar"),
    MAR(3, "Mars"),
    APR(4, "April"),
    MAI(5, "Mai"),
    JUN(6, "Juni"),
    JUL(7, "Juli"),
    AUG(8, "August"),
    SEP(9, "September"),
    OKT(10, "Oktober"),
    NOV(11, "November"),
    DES(12, "Desember");

    //La typen få en instansvariabel med navn mndnr og en aksessmetode med samme navn. Det betyr at Måned.JAN.mndnr() skal gi 1, osv. til at Måned.DES.mndnr() skal gi 12.
    private final int mndnr;
    //La også typen få en instansvariabel med navn fulltnavn. For JAN skal det være januar, osv.
    private final String fultnavn;

    private Måned(int mndnr, String fultnavn){
        this.mndnr = mndnr;
        this.fultnavn = fultnavn;
    };

    public int mndnr(){
        return mndnr;
    }

    @Override public String toString(){
        return fultnavn;
    }

    public static String toString(int mnd)
    {
        if (mnd < 1 || mnd > 12) throw
                new IllegalArgumentException("Ulovlig måndesnummer!");

        return values()[mnd - 1].toString();
    }

    public static Måned[] vår()
    {
        return Arrays.copyOfRange(values(),3,5);
    }

    public static Måned[] sommer()
    {
        return Arrays.copyOfRange(values(),5,8);
    }

    public static Måned[] høst()
    {
        return Arrays.copyOfRange(values(),8,10);
    }

    public static Måned[] vinter()
    {
        return new Måned[] { NOV, DES, JAN, FEB, MAR };
    }
}
