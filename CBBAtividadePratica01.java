public class CBBAtividadePratica01{
    public static void main(String[] args) {
        int[] array = new int[100]; //Construindo o array
        int k; //Variavel de controle do for
        for(k=0; k<100; k++){ //For para atribuir um valor a cada posição do array
            array[k] = k;
        }
        for(k=0; k<100; k++){ //For para imprimir o array
            System.out.println(array[k]);
        }
    }
}