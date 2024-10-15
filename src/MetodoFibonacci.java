public class MetodoFibonacci {
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int num) {
    int a = 0, b = 1;

    // Gerando a sequência de Fibonacci até encontrar o número ou ultrapassá-lo
    while (b < num) {
        int temp = a + b;
        a = b;
        b = temp;
    }
        
    // Verificando se o número é igual ao último valor gerado
    return b == num;
    }
}
