import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumerosNoIntervalo = 0;
        
        System.out.println("Digite 80 números:");
        for (int i = 0; i < 80; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                quantidadeNumerosNoIntervalo++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo [10, 150]: " + quantidadeNumerosNoIntervalo);
        scanner.close();
    }
}
