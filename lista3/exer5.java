import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacao = calcularValorPrestacao(valorCompra);
        
        System.out.println("Valor de cada prestação (em 5 prestações sem juros): R$" + valorPrestacao);
        
        scanner.close();
    }
    
    private static double calcularValorPrestacao(double valorCompra) {
        return valorCompra / 5;
    }
}
