package Weekend_Task.Week_34;


/*

	• Det opprettes en hjelpevariabel m som får 0 som startverdi: (1)
	• Opprettes en hjelpevariabel maksverdi som får a[0] som  startverdi og en indeksering: (2)
	• Løkkevariabelen i opprettes og får 1 som startverdi: (1)
	• I for-løkken utføres sammenligningen i < a.leangt n ganger: (n)
	• I for-løkken utføres addisjonen i++ n-1 ganger: (n-1)
	• Setningen if(a[i] > maksverdi) utføres (n-1). Den består av en indeksering og en sammenligning: 2(n-2
	• Tilordningen maksverdi =a[i]( 1 tilordning og 1 indeksering) og m=i(1 tilordning) utføres hver gang (a[i] > maksverdi) er sann: 3x
	• Verdien til m returneres: (1)

    Sum: 1 +2 +1 +n +(n-1)+2(n-1)+3x+1 = 2 +4n+3x


 */
public class Oppgave_1_1_4_i {

    public static int max(int[]a){
        int m = 0;
        int maksverdi =a[0];

        for(int i = 1; i < a.length;i++){
            if(a[i] > maksverdi) {
                maksverdi =a[i];
                m=i;
            }
        }
        return m;

    }
    public static void main(String[] args) {
        int[] a= {10,5,7,2,9,1,3,8,4,6};
        System.out.println(max(a));
    }
}

