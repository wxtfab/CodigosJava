package POO;

public class PublicarDocumentacao {

    String produto;
    String dataPublicacao;
    boolean validacao;
    int qtdPaginas;


    void foiValidada () {
        if (validacao == true) {
            System.out.println("Pode publicar!");
        } else {
            System.out.println("Falta validação!");
        }
    }



















}
