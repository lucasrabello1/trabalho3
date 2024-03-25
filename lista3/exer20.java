import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double horasTrabalhadas;
        while (true) {
            if (scanner.hasNextDouble()) {
                horasTrabalhadas = scanner.nextDouble();
                if (horasTrabalhadas >= 0) {
                    break;
                }
            }
            scanner.nextLine();
        }
        
        int nivel;
        while (true) {
            if (scanner.hasNextInt()) {
                nivel = scanner.nextInt();
                if (nivel >= 1 && nivel <= 3) {
                    break;
                }
            }
            scanner.nextLine();
        }
        
        double valorHora = 0;
        switch (nivel) {
            case 1:
                valorHora = 12.00;
                break;
            case 2:
                valorHora = 17.00;
                break;
            case 3:
                valorHora = 25.00;
                break;
        }
        
        double salario = horasTrabalhadas * valorHora;
        System.out.println("O salário do professor é: R$" + salario); 
        scanner.close();
    }
}
