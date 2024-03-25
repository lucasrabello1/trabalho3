import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o nome do funcionário:");
            String nome = scanner.nextLine();
            int idade;
            while (true) {
                try {
                    System.out.println("Digite a idade do funcionário:");
                    idade = Integer.parseInt(scanner.nextLine());
                    if (idade < 0) {
                        throw new IllegalArgumentException();
                    }
                    break;
                } catch (NumberFormatException e) {}
                  catch (IllegalArgumentException e) {}
            }
            char sexo;
            while (true) {
                try {
                    System.out.println("Digite o sexo do funcionário (M/F):");
                    String input = scanner.nextLine();
                    if (input.length() != 1 || (input.charAt(0) != 'M' && input.charAt(0) != 'F')) {
                        throw new IllegalArgumentException();
                    }
                    sexo = Character.toUpperCase(input.charAt(0));
                    break;
                } catch (IllegalArgumentException e) {}
            }
            
            System.out.println("Digite o salário fixo do funcionário:");
            double salario = scanner.nextDouble();
            double abono = 0;
            if (sexo == 'M') {
                if (idade >= 30) {
                    abono = 100.00;
                } else {
                    abono = 50.00;
                }
            } else if (sexo == 'F') {
                if (idade >= 30) {
                    abono = 200.00;
                } else {
                    abono = 80.00;
                }
            }
            double salarioLiquido = salario + abono;   
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Salário líquido: " + salarioLiquido);
            System.out.println("Deseja inserir os dados de outro funcionário? (S/N)");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
            scanner.nextLine();
        }    
        scanner.close();
    }
}
