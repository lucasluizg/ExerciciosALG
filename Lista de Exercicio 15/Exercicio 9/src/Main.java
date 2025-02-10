public class Main {
    public static void main(String[] args) {

        int base = 4;
        int altura = 8;

        int area = areaRetangulo(base, altura);
        System.out.println("Area: " + area);

    }

    static int areaRetangulo(int base, int altura) {
        int area = base * altura;
        return area;
    }

}