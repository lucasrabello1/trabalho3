import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalAptos = 0;
        int totalInaptos = 0;
        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine();        
        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a saúde da pessoa " + (i + 1) + " (Boa/Ruim):");
            String saude = scanner.nextLine().toLowerCase();
            if (sexo == 'M' && idade >= 18 && saude.equals("boa")) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }
        
        System.out.println("Total de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);
        scanner.close();
    }
}
