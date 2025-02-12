public class Main {
    public static void main(String[] args) {

        int celsius = 32;
        System.out.print(conversor(celsius));

    }

    static double conversor(double celsius){

        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;
    }
}