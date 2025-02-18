public class Main {
    public static void main(String[] args) {

        String palavra = "Lucas";
        inteiro(palavra);

    }

    static void inteiro(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
            System.out.print((int)palavra.charAt(i));
        }

    }
}