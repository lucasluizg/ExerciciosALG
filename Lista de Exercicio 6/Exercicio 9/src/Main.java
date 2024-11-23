//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int horas = 42;
        double valorHora = 10;
        double salario = valorHora * horas;
        double horaExtra = 0;

        if (horas > 40){
            horaExtra = (horas - 40) * (valorHora * 1.5);
        }

        System.out.println("Valor extra: R$ " + horaExtra);
        System.out.println("Salário: R$ " + salario);

    }
}
