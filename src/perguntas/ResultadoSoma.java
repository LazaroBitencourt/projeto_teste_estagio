package perguntas;

public class ResultadoSoma {

    public static void main(String[] args) {
        ResultadoSoma.imprimirSoma();
    }

    public static void imprimirSoma() {
        int nun1 = 13, k = 0, soma = 0;
        while (k < nun1) {
            k += 1;
            soma += k;
        }
        System.out.println("O valor da variável soma é " + soma);
    }
}

