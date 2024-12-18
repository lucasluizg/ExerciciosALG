public class Main {
    public static void main(String[] args) {

        String texto = "a162c3";
        int soma = 0;

        for (int i = 0; i < texto.length(); i++) {
            char numero = texto.charAt(i);
            if (numero >= '0' && numero <= '9') {
                switch (numero) {
                    case '1':
                        soma += 1;
                        break;
                    case '2':
                        soma += 2;
                        break;
                    case '3':
                        soma += 3;
                        break;
                    case '4':
                        soma += 4;
                        break;
                    case '5':
                        soma += 5;
                        break;
                    case '6':
                        soma += 6;
                        break;
                    case '7':
                        soma += 7;
                        break;
                    case '8':
                        soma += 8;
                        break;
                    case '9':
                        soma += 9;
                        break;
                }
            }
        }
        System.out.print(soma);
    }
}