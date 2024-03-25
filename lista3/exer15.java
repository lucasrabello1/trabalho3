import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;
        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar:");
            String tipoCombustivel = scanner.nextLine().toLowerCase();
            if (tipoCombustivel.equals("zero")) {
                break;
            }
            double valorVeiculo;
            while (true) {
                System.out.println("Digite o valor do veículo:");
                if (scanner.hasNextDouble()) {
                    valorVeiculo = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    break;
                } else {
                    System.out.println("Valor inválido. Digite novamente.");
                    scanner.nextLine(); // Limpar o buffer
                }
            }
            
            double desconto;
            if (tipoCombustivel.equals("álcool")) {
                desconto = valorVeiculo * 0.25;
            } else if (tipoCombustivel.equals("gasolina")) {
                desconto = valorVeiculo * 0.21;
            } else if (tipoCombustivel.equals("diesel")) {
                desconto = valorVeiculo * 0.14;
            } else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
                continue;
            }
            double valorFinal = valorVeiculo - desconto;
            totalDesconto += desconto;
            totalPago += valorFinal;
            
            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorFinal);
        }
        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);
        
        scanner.close();
    }
}
