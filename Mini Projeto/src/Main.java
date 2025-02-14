import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 99;
        int capacidade = 50;
        int quantidadeAlunos = 0;
        int quantidadeProvas = 0;

        String alunos[] = new String[capacidade];
        double notas[][] = new double[capacidade][3];

        while (opcao > 0) {
            System.out.println("""
                    +----- BANCO DE NOTAS -----+
                    | 1 - Cadastrar aluno      |
                    | 2 - Lançar notas         |
                    | 3 - Calcular conceito    |
                    | 4 - Editar nomes         |
                    | 5 - Editar notas         |
                    | 6 - Trancar matrícula    |
                    | 0 - Sair                 |
                    +--------------------------+
                    """);
            System.out.print("Digite a sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.next();
                    alunos[quantidadeAlunos] = nome;
                    quantidadeAlunos++;
                    imprimeTurma(alunos, quantidadeAlunos);
                    break;
                case 2:
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.print("Digite a nota para " + alunos[i] + ".");
                        notas[i][quantidadeProvas] = sc.nextDouble();
                    }
                    quantidadeProvas++;
                    imprimeNotas(notas, quantidadeAlunos, quantidadeProvas);
                    break;
                case 3:
                    System.out.println("Conceito calculado!");
                    break;
                case 4:
                    System.out.println("Nomes editados");
                    break;
                case 5:
                    System.out.println("Notas editadas");
                    break;
                case 6:
                    System.out.println("Aluno cadastrado");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    static void imprimeTurma(String[] alunos, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(alunos[i]);
        }
    }

    static void imprimeNotas(double notas[][], int quantidadeAlunos, int quantidadeProvas) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            for (int j = 0; j < quantidadeProvas; j++) {
                System.out.println(notas[i][j]);
            }
        }
    }
}