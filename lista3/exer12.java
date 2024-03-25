import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        
        char continuar;
        do {
            System.out.println("Digite o ano do veículo:");
            int anoVeiculo = scanner.nextInt();
            
            double desconto;
            if (anoVeiculo <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }
            
            System.out.println("Digite o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();
            
            double valorDesconto = valorVeiculo * desconto;
            double valorFinal = valorVeiculo - valorDesconto;
            
            System.out.println("Valor do desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);
            
            totalGeral++;
            
            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros calculados: " + totalGeral);
        
        scanner.close();
    }
}
