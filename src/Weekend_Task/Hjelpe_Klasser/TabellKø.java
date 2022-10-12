package Weekend_Task.Hjelpe_Klasser;

import Weekend_Task.Interface.Kø;
import Weekend_Task.Interface.Stakk;

import java.util.NoSuchElementException;

public class TabellKø<T> implements Kø<T> {

    private T[] a;      // en tabell
    private int fra;    // posisjonen til den første i køen
    private int til;    // posisjonen til første ledige plass

    @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
    public TabellKø(int lengde)
    {
        if (lengde < 1)
            throw new IllegalArgumentException("Må ha positiv lengde!");

        a = (T[])new Object[lengde];

        fra = til = 0;    // a[fra:til> er tom
    }

    public TabellKø()   // standardkonstruktør
    {
        this(8);
    }

    private T[] utvidTabell(int lengde)
    {
        @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
        T[] b = (T[])new Object[lengde];  // ny tabell

        // kopierer intervallet a[fra:a.length> over i b
        System.arraycopy(a,fra,b,0,a.length - fra);

        // kopierer intervallet a[0:fra> over i b
        System.arraycopy(a,0,b,a.length - fra, fra);

        fra = 0; til = a.length;
        return b;
    }

    public boolean leggInn(T verdi)   // null-verdier skal være tillatt
    {
        a[til] = verdi;                                 // ny verdi bakerst
        til++;                                          // øker til med 1
        if (til == a.length) til = 0;                   // hopper til 0
        if (fra == til) a = utvidTabell(2*a.length);    // sjekker og dobler
        return true;                                    // vellykket innlegging
    }

    public T taUt()
    {
        if (fra == til) throw new         // sjekker om køen er tom
                NoSuchElementException("Køen er tom!");

        T temp = a[fra];                  // tar vare på den første i køen
        a[fra] = null;                    // nuller innholdet
        fra++;                            // øker fra med 1
        if (fra == a.length) fra = 0;     // hopper til 0
        return temp;                      // returnerer den første
    }

    public int antall()
    {
        return fra <= til ? til - fra : a.length + til - fra;
    }

    public T kikk(){
        if ( fra==til )       // sjekker om stakken er tom
            throw new NoSuchElementException("Stakken er tom!");

        return a[fra];    // returnerer den øverste verdien
    }

    public boolean tom(){
        return fra == til;
    }

    public void nullstill(){
        while(!tom()){
            a[fra++] = null;
            if(fra==a.length){
                fra =0;
            }
        }
    }

    public static <T> void snu(Stakk<T> A)
    {
        Kø<T> B = new TabellKø<T>();
        while (!A.tom()) B.leggInn(A.taUt());
        while (!B.tom()) A.leggInn(B.taUt());
    }

}
