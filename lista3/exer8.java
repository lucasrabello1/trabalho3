import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite as três notas obtidas pelo aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        
        double media = calcularMedia(nota1, nota2, nota3);
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("Menção: Aprovado");
        } else if (media <= 5) {
            System.out.println("Menção: Reprovado");
        } else {
            System.out.println("Menção: Recuperação");
        }
        
        scanner.close();
    }
    
    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
