public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente,saldo);
    }

    public void imprimirExtrato() {
        System.out.println("Extrato Conta de Poupanca");
        super.toString();
    }
}
