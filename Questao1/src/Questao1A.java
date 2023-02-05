import java.util.Scanner;

public class Questao1A {
    public static void main (String[] args) {
        int i, j, k;
        System.out.print("Digite a palavra com 5 letras: ");
        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();

        System.out.println("Todas as palavras de três letras possíveis: ");
        for (i = 0; i < palavra.length(); i++) {
            for (j = 0; j < palavra.length(); j++) {
                for (k = 0; k < palavra.length(); k++) {
                    if (i == j || i == k || j == k) continue;
                    System.out.printf("%c%c%c\n", palavra.charAt(i), palavra.charAt(j), palavra.charAt(k));
                }
            }
        }
    }
}