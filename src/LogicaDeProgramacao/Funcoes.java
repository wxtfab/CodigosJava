package LogicaDeProgramacao;

public class Funcoes {
    public static void main(String[] args) {

// FUNÇÃO
        int resultado = 0; // crio uma variável resultado e inicializo ela com 0
        resultado = multiplicacao(4, 8); // depois faço resultado receber o retorno da função soma que está sendo passado como parâmetro os valores 4.5 e 8.4
        System.out.println("O resultado da multiplicacao é = " + resultado); // mostra o valor do resultado
    }

    public static int multiplicacao(int n1, int n2) { // quem é soma? soma é minha função que recebe dois parâmetros double e retorna double

        return n1 * n2; // vai retornar o parâmetro n1 + o parâmetro n2
    }


//        // PROCEDIMENTO
//        multiplicacao(100, 2);
//    }
//    public static void multiplicacao (int n1, int n2) { // void quer dizer que é um procedimento, não uma função
//        int resultado = 0;
//        resultado = n1 * n2;
//        System.out.println("O resultado da multiplicacao é =  " + resultado);
//    }


}


