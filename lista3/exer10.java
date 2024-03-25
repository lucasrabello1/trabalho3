import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();
        
        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            
            if (idade >= 0) {
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
            } else {
                System.out.println("Idade inválida. Digite novamente.");
                i--;
            }
        }
        
        scanner.close();
    }
}
