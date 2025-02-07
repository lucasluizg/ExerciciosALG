public class Main {
    public static void main(String[] args) {

        String palavra = "Lucas";
        System.out.println(contaVogais(palavra));

    }

    static int contaVogais(String palavra) {

        palavra = palavra.toLowerCase();
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        return contador;
    }

}