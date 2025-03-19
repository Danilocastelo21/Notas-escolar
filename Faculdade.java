import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Definir as matérias e os professores
        String[] materias = {"Matemática", "Português", "História", "Geografia","Inglês", "Biologia", "Quimica", "Fisica"};
        String[] professores = {"Prof. João", "Prof. Maria", "Prof. Carlos", "Prof. Ana", "Prof. Fagundes", "Prof. Monica", "Prof. Eduarda", "Prof. Isaac"};

        // Loop para processar cada matéria
        for (int i = 0; i < materias.length; i++) {
            System.out.println("\nMatéria: " + materias[i]);
            System.out.println("Professor: " + professores[i]);

            // Solicitar as quatro notas do aluno
            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }

            // Calcular a média das notas
            double somaNotas = 0;
            for (double nota : notas) {
                somaNotas += nota;
            }
            double media = somaNotas / notas.length;

            // Exibir o resultado da matéria
            System.out.println("Média na matéria " + materias[i] + ": " + media);
            if (media >= 7.0 && media <= 10.0) {
                System.out.println("Resultado: APROVADO");
            } else if (media >= 5.0 && media < 7.0) {
                System.out.println("Resultado: RECUPERAÇÃO");
            } else if (media >= 1.0 && media < 5.0) {
                System.out.println("Resultado: REPROVADO");
            } else {
                System.out.println("Resultado inválido (média fora do intervalo).");
            }
        }

        scanner.close();
    }
}