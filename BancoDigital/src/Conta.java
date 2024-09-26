public abstract class Conta implements IConta{
    private static int SEQUENCIAL =1;
    private static int AGENCIAPADRAO =2;

    private final Cliente cliente;
    private int numeroConta;
    private int agencia;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.numeroConta = SEQUENCIAL++;
        this.agencia = AGENCIAPADRAO;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

    public boolean sacar(double valor){
        if(saldo-valor<0)
            return false;
        else {
            saldo -= valor;
            return true;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomeCliente(){
        return cliente.getNome();
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNomeCliente() + "\nNúmero conta: "+ getNumeroConta() + "\nAgencia: " + getAgencia() + "\nSaldo: " + getSaldo();
    }

}
