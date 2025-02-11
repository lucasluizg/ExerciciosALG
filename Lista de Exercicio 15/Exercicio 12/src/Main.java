public class Main {
    public static void main(String[] args) {

        int perimetro = 15;
        System.out.print(areaCirculo(perimetro));

    }

    static double areaCirculo(int perimetro) {

        double raio = perimetro / (2 * 3.14);
        double area = 3.14 * (raio * raio);

        return area;
    }

}