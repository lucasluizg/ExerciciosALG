public class Main {
    public static void main(String[] args) {

        int valorCompra = 600;
        double desconto = 0.95;

        if (valorCompra > 500){
            desconto = 0.85;
        } else if (valorCompra > 100) {
            desconto = 0.9;
        }

        double precoFinal = valorCompra * desconto;

        System.out.println("O preço com desconto é: R$ " + precoFinal);

    }
}