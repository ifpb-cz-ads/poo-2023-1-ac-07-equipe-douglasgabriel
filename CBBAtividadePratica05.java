public class CBBAtividadePratica05{
	public static void main(String[] args) {
		String[] diasSemana = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado", "Domingo"};
		int a = 0;
		int b = 0;
		System.out.println("Imprimindo com while\n");
		while(a < diasSemana.length){
			System.out.println(diasSemana[a]);
			a++;
		}
		System.out.println("\n FIM \n");
		System.out.println("Imprimindo com do-while\n");
		do{
			System.out.println(diasSemana[b]);
			b++;
		}while(b < diasSemana.length);
		System.out.println("\n FIM \n");
		System.out.println("Imprimindo com for\n");
		for (int i = 0; i < diasSemana.length ; i++ ) {
			System.out.println(diasSemana[i]);
		}
		System.out.println("\n FIM \n");
	}
}