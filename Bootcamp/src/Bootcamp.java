import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Conteudo> conteudos;
    private Set<Dev> devsInscritos;

    public Bootcamp(String nome, String descricao) {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        devsInscritos = new HashSet<Dev>();
        conteudos = new LinkedHashSet<Conteudo>();
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public boolean addDev(Dev dev) {
        return devsInscritos.add(dev);
    }

    public void addConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, conteudos, devsInscritos);
    }
}
