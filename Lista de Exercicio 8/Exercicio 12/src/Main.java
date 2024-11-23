public class Main {
    public static void main(String[] args) {

    int x = 1;
    int y = 0;
    int i = 1;
    int fibonacci = 0;

        while (i < 10){
            fibonacci = x + y;
            y = x;
            x = fibonacci;
            i++;
            System.out.println(fibonacci);
        }
    }
}