import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double SALARIO_MINIMO = 1100.00;
        
        int funcionariosAte3Salarios = 0;
        int funcionariosEntre3e10Salarios = 0;
        int funcionariosEntre10e20Salarios = 0;
        int outrosFuncionarios = 0;
        
        for (int i = 0; i < 584; i++) {
            double salario = scanner.nextDouble();
            
            if (salario < 3 * SALARIO_MINIMO) {
                salario *= 1.5;
                funcionariosAte3Salarios++;
            } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
                salario *= 1.2;
                funcionariosEntre3e10Salarios++;
            } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
                salario *= 1.15;
                funcionariosEntre10e20Salarios++;
            } else {
                salario *= 1.1;
                outrosFuncionarios++;
            }   
            System.out.println(salario);
        }
        System.out.println(funcionariosAte3Salarios);
        System.out.println(funcionariosEntre3e10Salarios);
        System.out.println(funcionariosEntre10e20Salarios);
        System.out.println(outrosFuncionarios); 
        scanner.close();
    }
}
