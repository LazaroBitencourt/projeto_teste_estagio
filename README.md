# Desafio Target Sistemas
Este repositório contém as resoluções dos desafios propostos no processo seletivo de recrutamento. A linguagem utilizada para realizar o desafio foi a linguagem Java.
## Solução: Resultado de soma
```
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
```
## Solução: Fibonacci
```
public class VerificadorFibonacci {

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
```
## Solução: Lógica

a) 1, 3, 5, 7, ___ 
<br>Cada número é obtido somando o anterior com 2, formando os números ímpares. Assim, o próximo número será 7 + 2 = 9.

b) 2, 4, 8, 16, 32, 64, ____ 
<br>Cada número é obtido multiplicando o anterior por 2. Logo, o próximo número na sequência será 64 x 2 = 128.

c) 0, 1, 4, 9, 16, 25, 36, ____ 
<br>Cada número é resultante da adição do anterior com um número ímpar da sequência 1, 3, 5, 7, 9. Ao subtrair os dois últimos números, obtemos 36 - 25 = 11.
Logo, para obter o próximo número, acrescentamos 11 + 2 = 13 ao último número, resultando em 36 + 13 = 49.

d) 4, 16, 36, 64, ____ 
<br>Cada número é igual ao quadrado dos números pares. Logo, temos que 64 = 8². Assim, o próximo número par é 10, e o seu quadrado é 10² = 100.

e) 1, 1, 2, 3, 5, 8, ____
<br>Cada número é obtido somando o número anterior com o número atual . Logo, o próximo número será 8 + 5 = 13.

f) 2,10, 12, 16, 17, 18, 19, ____ 
<br>Esta sequência foi por números que iniciam com a letra d. Logo, o próximo número em ordem crescente que inicia com a letra d será 200.

## Solução: Interruptores

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. 
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Serão 3 salas cada uma contendo uma lâmpada:
Primeira ida 
Ligo o interruptor e espero tempo sufuciente para esquenta a lampada e desligo o interruptor.
Ligo o interruptor 2, vou até uma das 3 salas.
Se a lampada estiver acessa, pertence ao interruptor 2, se estiver desligada e quente pertence ao interruptor 1, se estiver desligada e fria pertence ao interruptor 3.

Segunda ida:
Como já identifiquei a qual pertence um interruptor, mantenho um interruptor ligado e outro desligado entre os restantes.
Dirijo-me a outra sala para determinar os outros dois interruptores .

## Solução: Inverter String
```
public class InverteString {

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
```
