public class Main {
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50};
        zeraArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void zeraArray(int array[]){

        for(int i = 0; i < array.length; i++){
            array[i] = 0;
        }

    }
}