import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        while (true) {
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 5) {
                    break;
                }
            }
            scanner.nextLine();
        }
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }
        System.out.println("Categoria do nadador: " + categoria);   
        scanner.close();
    }
}
