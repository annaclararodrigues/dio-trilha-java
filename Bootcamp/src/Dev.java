import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(String nome){
        this.nome = nome;
        conteudosInscritos = new LinkedHashSet<Conteudo>();
        conteudosConcluidos = new LinkedHashSet<Conteudo>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.addDev(this);

    }

    public void progredir(){
        Optional<Conteudo> primeiroConteudo = this.conteudosInscritos.stream()
                .findFirst();
        if(primeiroConteudo.isPresent()){
            this.conteudosConcluidos.add(primeiroConteudo.get());
            this.conteudosInscritos.remove(primeiroConteudo.get());
        }
        else
            System.out.println("Você não está inscrito em nenhum contéudo!");
    }

    public boolean progredir2(Conteudo conteudo){
        if(this.conteudosInscritos.contains(conteudo)){
            this.conteudosInscritos.remove(conteudo);
            this.conteudosConcluidos.add(conteudo);
            return true;
        }
        else
            return false;

    }

    public double calcularXPTotal(){
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String getConteudosInscritos(){
        return this.conteudosInscritos.stream()
                .map(Conteudo::getTitulo)
                .collect(Collectors.joining(", "));
    }

    public String getConteudosConcluidos(){
        return this.conteudosConcluidos.stream()
                .map(Conteudo::getTitulo)
                .collect(Collectors.joining(", "));
    }

    
}
