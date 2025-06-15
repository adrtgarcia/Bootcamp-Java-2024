import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nPor favor, digite o número da conta: ");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.println("\nPor favor, digite a agência: ");
        agencia = scan.nextLine();
        System.out.println("\nPor favor, digite seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.println("\nPor favor, digite seu saldo: ");
        saldo = scan.nextDouble();
        scan.close();
        System.out.println();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
