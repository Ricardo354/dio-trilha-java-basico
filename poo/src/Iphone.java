public class Iphone{

    public Navegador navegador;
    public MusicPlayer music_player;
    public Telefone telefone;

    public Iphone(){

        this.navegador = new Navegador();
        this.music_player = new MusicPlayer();
        this.telefone = new Telefone();

    }


}
