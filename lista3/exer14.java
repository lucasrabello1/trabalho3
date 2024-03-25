import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;
        System.out.println("Digite o preço de custo e o preço de venda dos 40 produtos:");
        for (int i = 0; i < 40; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println("Preço de custo:");
            double precoCusto = scanner.nextDouble();
            totalPrecoCusto += precoCusto;
            
            System.out.println("Preço de venda:");
            double precoVenda = scanner.nextDouble();
            totalPrecoVenda += precoVenda;
            
            if (precoVenda > precoCusto) {
                System.out.println("Produto " + (i + 1) + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + (i + 1) + ": Prejuízo");
            } else {
                System.out.println("Produto " + (i + 1) + ": Empate");
            }
        }
        double mediaPrecoCusto = totalPrecoCusto / 40;
        double mediaPrecoVenda = totalPrecoVenda / 40;
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        scanner.close();
    }
}
