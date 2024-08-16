public class iPhone implements ReprodutorMusical, AparalhoTelefonico, NavegadorWeb{
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma musiquinha legal");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música : "+ musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para número : "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página : "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}