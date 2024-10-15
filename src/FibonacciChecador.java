import java.util.Scanner;

public class FibonacciChecker extends MetodoFibonacci{
    public static void main(String[] args) {

        // Entrada do número pelo usuário
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            
            // Verificação e exibição da mensagem
            if (pertenceFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
            }
        }
    }
}
