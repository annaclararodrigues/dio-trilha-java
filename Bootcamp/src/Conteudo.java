public abstract class Conteudo {
    protected static final double XP_PADRAO=10d;


    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nDescricao: " + descricao;
    }

    public String getTitulo() {
        return titulo;
    }
}
