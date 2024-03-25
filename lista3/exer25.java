import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do estudante:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o número de matrícula do estudante:");
        int matricula = scanner.nextInt();
        
        System.out.println("Informe as notas do estudante:");
        double notaLaboratorio = lerNota(scanner, "trabalho de laboratório");
        double notaAvaliacao = lerNota(scanner, "avaliação semestral");
        double notaExameFinal = lerNota(scanner, "exame final");
        
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExameFinal);
        String classificacao = calcularClassificacao(notaFinal);
        
        System.out.println("--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
    
    private static double lerNota(Scanner scanner, String tipoNota) {
        double nota;
        while (true) {
            System.out.println("Digite a nota do " + tipoNota + " (0 a 10):");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma nota válida (entre 0 e 10).");
            scanner.nextLine();
        }
        return nota;
    }
    
    private static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExameFinal) {
        return (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExameFinal * 5) / 10;
    }
    
    private static String calcularClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }
}
