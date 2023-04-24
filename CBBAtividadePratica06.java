import java.util.Scanner;
public class CBBAtividadePratica06{
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int[] numeros = new int[10];
		int numM = 0;
		System.out.println("Informe os numeros que serao armazenados");
		for ( int j = 0 ; j < numeros.length ; j++ ) {
			numeros[j] = scanf.nextInt();
		}
		System.out.println();
		for (int i = 0 ; i < numeros.length ; i++ ) {
			System.out.println(numeros[i]);
			if (numM <= numeros[i]) {
				numM = numeros[i];
			}
		}
		System.out.println("O maior numero e: "+numM);
	}
}