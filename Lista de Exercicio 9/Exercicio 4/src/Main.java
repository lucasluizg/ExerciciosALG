import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = reader.nextInt();

        System.out.print("Digite outro valor: ");
        int n2 = reader.nextInt();

        int maior;
        int menor;
        int mmc = 1;

        if (n1 > n2){
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }

        for (int i = 1; i <= maior; i++){
            if (menor % i == 0 && maior % i == 0){
                menor = menor / i;
                maior = maior / i;
                mmc = mmc * i;
            } else if (menor % i == 0){
                menor = menor / i;
                mmc = mmc * i;
            } else if (maior % i == 0){
                maior = maior / i;
                mmc = mmc * i;
            }
        }

        System.out.println("O mmc de " + n1 + " e " + n2 + " é: " + mmc);
        reader.close();
    }
}