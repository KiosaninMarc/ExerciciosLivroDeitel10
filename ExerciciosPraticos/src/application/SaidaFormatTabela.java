package application;

public class SaidaFormatTabela {

	public static void main(String[] args) {
		
		System.out.println(" N     10*N     100*N     1000*N");
		
		int n = 10;
		int a;
		int b;
		int c;
		int cont = 1;
		
		System.out.println("================================");
		while (cont < 6) {
			a = n * cont;
			b = a * n;
			c = b * n;
			System.out.println(" " + cont + "     " + a + "       " + b + "       " + c);
			cont++;
		}
		
	}

}
