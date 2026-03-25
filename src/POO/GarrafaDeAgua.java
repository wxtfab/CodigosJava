package POO;

public class GarrafaDeAgua { // CLASSE

    String material; // ATRIBUTO
    String cor; // ATRIBUTO
    int quantosMl; // ATRIBUTO
    boolean estaCheia; // ATRIBUTO
    boolean temTampa; // ATRIBUTO


    void status() {
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("ML: " + quantosMl + "ml");
        System.out.println("Está cheia: " + estaCheia);
        System.out.println("Tem tampa: " + temTampa);
    }


    void garrafaCheia() {
        if (estaCheia == true) {
            System.out.println("A garrafa está cheia!");
        } else {
            System.out.println("A garrafa está vazia!");
        }

    }


        void garrafaTampada () {
            if (temTampa == true) {
                System.out.println("A garrafa está tampada!");
            } else {
                System.out.println("A garrafa está sem tampa!");
            }
        }

    }



