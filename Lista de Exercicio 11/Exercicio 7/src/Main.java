import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma sentença: ");
        String frase = reader.nextLine();

        int maiorComprimento = 0;
        int comprimentoAtual = 0;
        char caracter;
        String palavraMaior = "";

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (frase.charAt(i) == ' ') {
                if (comprimentoAtual > maiorComprimento) {
                    maiorComprimento = comprimentoAtual;
                    palavraMaior = frase.substring(i - comprimentoAtual, i);
                }
                comprimentoAtual = 0;
            }
            comprimentoAtual++;
        }

        if (comprimentoAtual > maiorComprimento) {
            maiorComprimento = comprimentoAtual;
            palavraMaior = frase.substring(frase.length() - comprimentoAtual + 1);

        }
        System.out.println(palavraMaior);
    }
}