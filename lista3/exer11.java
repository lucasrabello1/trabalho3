import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();
            
            char sexo;
            do {
                System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M para masculino, F para feminino):");
                sexo = scanner.nextLine().toUpperCase().charAt(0);
                
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo inválido. Digite novamente.");
                }
            } while (sexo != 'M' && sexo != 'F');
            
            if (sexo == 'M') {
                System.out.println(nome + " é homem");
                totalHomens++;
            } else {
                System.out.println(nome + " é mulher");
                totalMulheres++;
            }
        }
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        scanner.close();
    }
}
