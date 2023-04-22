public class CBBAtividadePratica04{
    public static void main(String[] args) {
        int[] array = new int[100]; //Construindo o array
        int k; //Variavel de controle do for
        for(k=0; k<101; k++){ //For para atribuir um valor a cada posição do array
            array[k] = k;
        }
        for(k=0; k<101; k++){ //For para imprimir o array
            System.out.println(array[k]);
        }
    }
}

/*
 * Resultado:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 100
        at CBBAtividadePratica04.main(CBBAtividadePratica04.java:6)
 */