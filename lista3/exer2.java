import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida pelo automóvel (em km):");
        double distanciaPercorrida = scanner.nextDouble();
        
        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = calcularConsumoMedio(distanciaPercorrida, combustivelGasto);
        
        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
        
        scanner.close();
    }
    
    private static double calcularConsumoMedio(double distanciaPercorrida, double combustivelGasto) {
        if (combustivelGasto == 0) {
            return 0; // Evitar divisão por zero
        }
        return distanciaPercorrida / combustivelGasto;
    }
}
