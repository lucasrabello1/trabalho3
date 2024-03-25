import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, lado3;
        while (true) {
            try {
                lado1 = Integer.parseInt(scanner.nextLine());
                lado2 = Integer.parseInt(scanner.nextLine());
                lado3 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {}
        }        
        if (isTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
        
        scanner.close();
    }
    public static boolean isTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2);
    }
}
