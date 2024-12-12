public class Main {
    public static void main(String[] args) {

        double nota1 = 8.3;
        double nota2 = 7.1;
        double nota3 = 5.9;
        double nota4 = 6.3;
        double menor = nota1;

        if (nota2 < menor){
            menor = nota2;
        }

        if (nota3 < menor){
            menor = nota3;
        }

        if (nota4 < menor){
            menor = nota4;
        }

        double media = (nota1 + nota2 + nota3 + nota4 - menor) / 3;

        System.out.println("Menor nota: " + menor);
        System.out.println("Média: " + media);

        }
}