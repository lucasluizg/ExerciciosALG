//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double peso = 80;
        double altura = 1.81;
        double IMC = peso / (altura * altura);

        System.out.println("IMC = " + IMC);

        if (IMC >= 30){
            System.out.println("Obesidade");
        } else if (IMC >= 25){
            System.out.println("Sobrepeso");
        } else if (IMC >= 18.5){
            System.out.println("Normal");
        } else {
            System.out.println("Magreza");
        }

    }
}