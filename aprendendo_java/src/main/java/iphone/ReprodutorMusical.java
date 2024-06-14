package iphone;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("MUSICA TOCANDO.");
    }
    public void pausar(){
        System.out.println("MUSICA PAUSADA.");
    }

    public void selecionarMUsica(String nomeDaMusica){
        System.out.println(nomeDaMusica.toUpperCase()+ " SELCIONADA.");
    }
}