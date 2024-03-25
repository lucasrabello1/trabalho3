import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();
        
        System.out.println("Digite o percentual de acréscimo (em %):");
        double percentualAcrescimo = scanner.nextDouble();
        
        double precoVenda = calcularPrecoVenda(precoCusto, percentualAcrescimo);
        
        System.out.println("O preço de venda do produto é: R$" + precoVenda);
        
        scanner.close();
    }
    
    private static double calcularPrecoVenda(double precoCusto, double percentualAcrescimo) {
        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        return precoCusto + acrescimo;
    }
}
