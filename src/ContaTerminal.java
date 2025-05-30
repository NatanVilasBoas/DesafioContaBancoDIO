import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da Conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, informe seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + (", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", conta " + numeroConta + " e seu " +
                "saldo " + saldo + " já está disponível para saque"));
    }
}