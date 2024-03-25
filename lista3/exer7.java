import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();
        
        double custoConsumidor = calcularCustoConsumidor(custoFabrica);
        
        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);
        
        scanner.close();
    }
    
    private static double calcularCustoConsumidor(double custoFabrica) {
        double impostos = custoFabrica * 0.45;
        double percentagemDistribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + percentagemDistribuidor;
    }
}
