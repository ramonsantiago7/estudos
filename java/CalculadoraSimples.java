// CalculadoraSimples.java
import java.util.Scanner;

public class CalculadoraSimples {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    
}
// This is a simple Java program that implements a basic calculator.

