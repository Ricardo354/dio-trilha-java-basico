//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.music_player.selecionarMusica("Eminem");
        iphone.music_player.tocar();
        iphone.music_player.pausar();

        iphone.telefone.atender();
        iphone.telefone.ligar("123123123123");
        iphone.telefone.iniciarCorreioVoz();

        iphone.navegador.exibirPagina("https://test.com");
        iphone.navegador.adicionarNovaAba();
        iphone.navegador.atualizarPagina();


    }
}