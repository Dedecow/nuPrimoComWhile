public class App {
    public static void main(String[] args) throws Exception {
        int num = 21; // Número que desejamos verificar se é primo
int divisor = 2; // Começamos com o menor divisor possível

boolean isPrime = true; // Variável para armazenar se o número é primo ou não

while (divisor <= num / 2) {
    if (num % divisor == 0) {
        isPrime = false;
        break; // Se encontrarmos um divisor, não é necessário continuar verificando
    }
    divisor++;
}

if (isPrime) {
    System.out.println(num + " é um número primo.");
} else {
    System.out.println(num + " não é um número primo.");
}

}

}

