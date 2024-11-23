public class Main {
    public static void main(String[] args) {

        int x = 1;
        int soma = 0;

        while (x <= 50){
            if (x % 2 == 0){
                soma += x;
            }
            x++;
        }

        System.out.println("Soma dos números pares: " + soma);
    }
}