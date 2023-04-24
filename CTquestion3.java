import java.util.Random;
public class CTquestion3{
	public static void main(String[] args) {
		Random rand = new Random();
		int[] notasAluno = new int[10];
		double media = 0;
		for(int i = 0; i < notasAluno.length; i++){
			notasAluno[i] = rand.nextInt(0, 10);
			media += notasAluno[i];
			System.out.println(notasAluno[i]);
		}
		media = media/notasAluno.length;
		int notasAcima = 0;
		int notasAbaixo = 0;
		for (int j = 0 ; j < notasAluno.length ; j++ ) {
			if (notasAluno[j] > media) {
				notasAcima++;
			}else{
				notasAbaixo++;
			}
		}
		System.out.println("Foram "+notasAcima+" notas a cima da media e "+notasAbaixo+" a baixo da media");

	}
}