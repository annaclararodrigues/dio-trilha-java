public class Dispositivo {
    public static void main(String[] args) {
        iPhone celular = new iPhone();

        celular.ligar("3215-3212");
        celular.atender();
        celular.iniciarCorreioVoz();

        celular.tocar();
        celular.pausar();
        celular.selecionarMusica("Kiss from a rose");

        celular.adicionarNovaAba();
        celular.exibirPagina("www.fotosdeorquinhas.com.br");
        celular.atualizarPagina();
    }
}
