public class Main {
    public static void main(String[] args) {

        String palavra = "Paralelepípedo";
        localizaMeio(palavra);

    }

    public static void localizaMeio(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.length() % 2 == 0) {
                System.out.print(palavra.charAt(palavra.length() / 2));
                break;
            } else if (palavra.length() % 2 != 0) {
                System.out.print(palavra.charAt(palavra.length() / 2));
                System.out.print(palavra.charAt((palavra.length() / 2) + 1));
                break;
            }
        }

    }

}