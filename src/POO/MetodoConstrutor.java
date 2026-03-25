package POO;

public class MetodoConstrutor { // CLASSE EXECUTÁVEL

public static void main(String[] args) {
//
//        CanetaConstrutor c1 = new CanetaConstrutor(); // criar o objeto Caneta
//
//        c1.setModelo("Bic"); // define o valor de modelo. aqui utilizei o metodo acessor
////        c1.modelo = "Bic"; // aqui acessei diretamente o atributo
//
//
//        c1.setPonta(0.5); // define o valor de ponta
////        c1.ponta = 0.5; // vai dar erro pois o atributo é privado, não pode ser acesssado
//
//    System.out.println("Tenho uma caneta modelo " + c1.getModelo() + " de ponta " + c1.getPonta()); // aqui eu tive acesso pelos métodos acessores, que protegem os atributos privados, assim não posso acessar diretamente eles
//
//
////        c1.status();


        CanetaConstrutor c1 = new CanetaConstrutor("NIC", "Amarelo", 0.5); // aqui já passei os valores direto
        c1.status();

        CanetaConstrutor c2 = new CanetaConstrutor("KKK", "Rosa", 1.5);
        c2.status();







}
}
