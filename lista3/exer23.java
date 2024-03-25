import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        char sexo = readGenderInput(scanner);
        double altura = readHeightInput(scanner);
        int idade = readAgeInput(scanner);
        double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);
        
        System.out.println("Nome: " + nome);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
        scanner.close();
    }
    private static char readGenderInput(Scanner scanner) {
        char sexo;
        while (true) {
            System.out.println("Digite o sexo da pessoa (M/F):");
            sexo = Character.toUpperCase(scanner.next().charAt(0));
            if (sexo == 'M' || sexo == 'F') {
                break;
            }
            System.out.println("Por favor, digite 'M' para masculino ou 'F' para feminino:");
        }
        return sexo;
    }
    
    private static double readHeightInput(Scanner scanner) {
        double altura;
        while (true) {
            System.out.println("Digite a altura da pessoa em metros:");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura > 0) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma altura válida:");
            scanner.nextLine();
        }
        return altura;
    }
    
    private static int readAgeInput(Scanner scanner) {
        int idade;
        while (true) {
            System.out.println("Digite a idade da pessoa:");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 0) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma idade válida:");
            scanner.nextLine();
        }
        return idade;
    }
    
    private static double calcularPesoIdeal(char sexo, double altura, int idade) {
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    return 72.7 * altura - 53;
                } else {
                    return 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    return 72.7 * altura - 50;
                } else {
                    return 72.7 * altura - 58;
                }
            }
        } else {
            if (altura > 1.50) {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 44.7;
                }
            } else {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 49.7;
                }
            }
        }
    }
}
