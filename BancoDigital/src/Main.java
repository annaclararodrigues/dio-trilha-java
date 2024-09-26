//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna Clara", "123.456.789-10", "Brasil", "1234-5678");
        Cliente cliente2 = new Cliente("Luisa", "123.654.789-01", "Brasil", "1234-8765");

        Conta conta = new ContaPoupanca(cliente,250.0);
        Conta conta2 = new ContaCorrente(cliente2,200.0);

        Banco bankEm = new Banco("BankEm", 1234);
        bankEm.addConta(conta);
        bankEm.addConta(conta2);

        conta.depositar(100.0);
        conta.transferir(50.0,conta2);

        bankEm.listarContas();




    }
}