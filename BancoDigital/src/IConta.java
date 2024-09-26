public interface IConta {

    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(double valor, Conta destino);
    String toString();
}
