public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente,saldo);
    }

    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.toString();
    }


}
