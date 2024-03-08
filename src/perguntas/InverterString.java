package perguntas;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.println(inverterString(palavra));
        scanner.close();
    }

    private static String inverterString(String string) {
        String palavraInvertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            palavraInvertida += string.charAt(i);
        }
        return palavraInvertida;
    }
}

