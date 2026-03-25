package POO;

public class Caneta {

    // Atributos (características)
    public String modelo;
    private double ponta;
    private boolean tampada;

    //Construtor (opcional por enquanto)
    public Caneta() {
        this.tampada = true; // começa tampada
    }

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    // Métodos (comportamentos)
    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Está tampada: " + tampada);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("Erro! Não pode rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}



