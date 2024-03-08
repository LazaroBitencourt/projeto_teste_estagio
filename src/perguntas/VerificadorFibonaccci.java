package perguntas;

import java.util.Scanner;

public class VerificadorFibonaccci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número : ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (isFabonacci(num)) {
                System.out.printf("O número %d pertence a sequência de Fibonacci", num);
            } else {
                System.out.printf("O número %d não pertence a sequência de Fibonacci", num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido");
        } finally {
            scanner.close();
        }
    }

    private static boolean isFabonacci(int num) {
        int termo1 = 0, termo2 = 1, auxiliar = 0;
        while (termo2 < num) {
            auxiliar = termo2;
            termo2 = termo1 + termo2;
            termo1 = auxiliar;
        }
        return termo2 == num;
    }

}
