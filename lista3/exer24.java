import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Nota Final");
        System.out.println("--------------------------");
        
        System.out.println("Por favor, digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = lerNota(scanner);
        
        System.out.println("Por favor, digite a nota da avaliação semestral (0 a 10):");
        double notaAvaliacao = lerNota(scanner);
        
        System.out.println("Por favor, digite a nota do exame final (0 a 10):");
        double notaExameFinal = lerNota(scanner);
        
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExameFinal);
        
        System.out.println("--------------------------");
        System.out.println("Nota Final: " + notaFinal);
        
        scanner.close();
    }
    
    private static double lerNota(Scanner scanner) {
        double nota;
        while (true) {
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma nota válida (entre 0 e 10):");
            scanner.nextLine();
        }
        return nota;
    }
    
    private static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExameFinal) {
        double notaFinal = (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }
}
