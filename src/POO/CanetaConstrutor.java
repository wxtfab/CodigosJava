package POO;

public class CanetaConstrutor { // CLASSE MOLDE

    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

// METODO CONSTRUTOR - metodo que tem o mesmo nome da classe

    public CanetaConstrutor(String m, String c, double p) { // 3 parâmetros que serão recebidos aqui
        modelo = m;
        cor = c;
        ponta = p;
        tampar();

    }

// METODOS "NORMAIS"

    public void tampar() {
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }

// METODOS ACESSORES GETTER E SETTER

    public String getModelo() { // metodo getter, não pode usar void pois void não tem retorno
        return modelo;
    }

    public void setModelo(String m) { // metodo setter, pode usar void pois não pede retorno (vai receber m que é do tipo String)
        modelo = m; // o modelo recebe m
    }

    public double getPonta() { // metodo getter, não pode usar void pois void não tem retorno
        return ponta;
    }

    public void setPonta(double p) { // metodo setter, pode usar void pois não pede retorno (vai receber m que é do tipo String)
        ponta = p; // a ponta recebe p
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        cor = c;
    }

// METODO STATUS

    public void status() { // metodo status
        System.out.println("--------SOBRE A CANETA--------");
//        System.out.println("Modelo: " + modelo);
        System.out.println("Modelo: " + getModelo()); // a mesma coisa que chamar o atributo direto

//        System.out.println("Ponta: " + ponta);
        System.out.println("Ponta: " + getPonta()); // mesma coisa que chamar o atributo direto

        System.out.println("Cor: " + getCor());

        System.out.println("Tampada: " + tampada);
    }


}
