import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        
        double[] notas = new double[3];
        double somaNotas = 0;
        
        System.out.println("Digite as notas das três provas:");
        for (int i = 0; i < 3; i++) {
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }
        
        double media = somaNotas / 3;
        
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média do aluno: " + media);
        
        scanner.close();
    }
}
