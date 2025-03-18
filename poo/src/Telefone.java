public class Telefone  implements  AparelhoTelefonico{

    public void ligar(String numero) {
        System.out.println("ligando pra "+numero);
    }

    public void atender() {
        System.out.println("atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Inciando correio de voz");
    }


}
