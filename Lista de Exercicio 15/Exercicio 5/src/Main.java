public class Main {
    public static void main(String[] args) {

        String palavra = "socorrammesubinoonibusemmarrocos";
        System.out.print(inverteString(palavra));

    }

    static boolean inverteString(String palavra) {

        boolean palindromo = true;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = false;
            }
        }
        return palindromo;
    }

}