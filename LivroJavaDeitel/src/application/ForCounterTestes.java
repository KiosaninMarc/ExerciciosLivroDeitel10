package application;

public class ForCounterTestes {

	public static void main(String[] args) {
		
		int i = 1;

		for (int counter = 1; counter <= 100; counter++) {
			if (i > 10) {
				System.out.println();
				i = 1;
			}
			System.out.printf("%d ", counter);
			i++;		
		}
		System.out.println();	
	}
}
