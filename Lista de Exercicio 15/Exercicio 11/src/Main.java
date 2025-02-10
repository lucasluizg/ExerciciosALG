public class Main {
    public static void main(String[] args) {

        int raio = 15;
        System.out.println(perimetroCirculo(raio));

    }

    static double perimetroCirculo(double raio) {

        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }

}