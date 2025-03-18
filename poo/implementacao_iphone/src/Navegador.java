public class Navegador implements NavInternet{

    public void exibirPagina(String url) {
        System.out.println("Exibindo página "+url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
