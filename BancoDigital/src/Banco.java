import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final int numeroAgencia;
    private List<Conta> contas;
    private double fundoDinheiro = 500000.0;

    public Banco(String nome, int numeroAgencia) {
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        contas = new ArrayList<Conta>();
    }

    public String getNome(){
        return nome;
    }
    public void addConta(Conta conta){
        contas.add(conta);
    }
    public void removeConta(Conta conta){
        contas.remove(conta);
    }

    public double getFundoDinheiro() {
        return fundoDinheiro;
    }

    public void listarContas(){
        System.out.println("Contas:");
        for(Conta conta : contas){
            System.out.println(conta.toString());
            System.out.println("----       -----         ------");
        }
    }


}
