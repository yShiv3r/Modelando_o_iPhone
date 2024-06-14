package iphone;

public class Celular {

    public static void main(String[] args) {

        ReprodutorMusical spotfy = new ReprodutorMusical();
        spotfy.selecionarMUsica("Let's go 4 - dj GBR");
        spotfy.tocar();
        spotfy.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("(11)987452365");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorNaInternet internet = new NavegadorNaInternet();
        internet.adicionarNovaAba();
        internet.exibirPagina("www.facebook.com");
        internet.atualizarPagina();
    }

}
