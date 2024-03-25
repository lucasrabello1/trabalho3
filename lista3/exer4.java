import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolares = scanner.nextDouble();
        
        double valorEmReais = converterDolarParaReal(cotacaoDolar, quantidadeDolares);
        
        System.out.println("Valor em reais: R$" + valorEmReais);
        
        scanner.close();
    }
    
    private static double converterDolarParaReal(double cotacaoDolar, double quantidadeDolares) {
        return cotacaoDolar * quantidadeDolares;
    }
}
