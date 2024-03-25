import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();
        
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();
        
        System.out.println("Digite o total de vendas efetuadas pelo vendedor no mês (em dinheiro):");
        double totalVendas = scanner.nextDouble();
        
        double salarioFinal = calcularSalarioFinal(salarioFixo, totalVendas);
        
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo do vendedor: R$" + salarioFixo);
        System.out.println("Salário final do vendedor no final do mês: R$" + salarioFinal);
        
        scanner.close();
    }
    
    private static double calcularSalarioFinal(double salarioFixo, double totalVendas) {
        double comissao = 0.15 * totalVendas;
        return salarioFixo + comissao;
    }
}
