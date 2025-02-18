public class Main {
    public static void main(String[] args) {

        String palavra[] = {"lucas", "wellington", "carlos", "ana", "sanchez"};
        crescente(palavra);

    }

    static void crescente(String palavra[]) {

        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < palavra.length; j++) {
                if (palavra[i].length() < palavra[j].length()) {
                    String temp = palavra[i];
                    palavra[i] = palavra[j];
                    palavra[j] = temp;
                }
            }
        }

        for (int i = 0; i < palavra.length; i++) {
            System.out.print(palavra[i] + " ");
        }

    }
}