public class Main {
    public static void main(String[] args) {

        int numero = 978537;
        System.out.print(somaDigito(numero));

    }

    static int somaDigito (int numero) {

        int soma = 0;
        int digito = 0;

        for (int i = 0; numero > 1; i++) {
            digito = numero % 10;
            numero /= 10;
            soma += digito;
        }
        return soma;
    }
}