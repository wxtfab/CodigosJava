package POO;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    // METODO CONSTRUTOR


    public ControleRemoto() {
        volume = 50;
        ligado = true;
        tocando = false;
    }

    // METODOS ESPECIAIS GET E SET
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // METODOS ABSTRATOS SOBRESCREVIDOS DA INTERFACE CONTROLADOR
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() { // quando apertar no Menu, vai aparecer umas informações como volume, se tá ligado, se tá reproduzindo
        System.out.println("Está ligado? " + this.getLigado()); // para saber se o controle está ligado ou não
        System.out.println("Está tocando? "+ getTocando()); // vai mostrar se está tocando ou não
        System.out.print("Volume: " + getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println(" — ");// vou mostrar o volume, mas vou mostrar barrinhas com o volume
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu..."); // só aparece isso na tela
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) { // se a tv estiver ligada
            this.setVolume(getVolume() + 5); // daí aumento o volume de 1 em 1
        } else {
            System.out.println("Impossível aumentar o volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) { // se a tv estiver ligada
            this.setVolume(getVolume() - 5); // daí diminui o volume de 1 em 1
        } else {
            System.out.println("Impossível diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) { // se a tv estiver ligada e não estiver tocando, daí o play funciona
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
        System.out.println("Não consegui pausar!");
        }
    }

}


