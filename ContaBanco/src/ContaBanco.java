import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String nomeAgencia, nomeCliente;
        double saldoConta;

        System.out.println("Por favor, digite o seu nome : ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome da agência : ");
        nomeAgencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta : ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o seu saldo inicial : ");
        saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "
        + nomeAgencia + ", conta "+ numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
        
        scanner.close();
    }
}
