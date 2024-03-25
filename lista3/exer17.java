import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();
        
        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        
        double novoSalario = salarioFuncionario * 1.1;
        double aumentoFolha = novoSalario - salarioFuncionario;
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + (novoSalario - salarioFuncionario));
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);
        
        scanner.close();
    }
}
