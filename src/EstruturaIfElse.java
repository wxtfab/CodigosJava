import java.util.Scanner;
public class EstruturaIfElse {

    public static void main(String[] args) {

// EXERCÍCIO    1
//        int idade = 15;
//
//        if(idade >= 18) { // se a idade for maior ou igual a 18, o bloco de código dentro do if será executado
//           System.out.println("Você é maior de idade.");
//        } else {
//            System.out.println("Você é menor de idade.");
//        }


// EXERCÍCIO    2
//     boolean estaChovendo = true;
//
//      if (!estaChovendo) { // se não estiver chovendo, o bloco de código dentro do if será executado, esse ! é negação
//          System.out.println("Vamos sair para passear!");
//      } else {
//          System.out.println("Vamos ficar em casa");
//      }


// EXERCÍCIO       3
//        boolean temDinheiro = false;
//        boolean temCartao = true;
//
//        if (temDinheiro && temCartao) { // se ele tem dinheiro e cartão, ele pede os dois
//            System.out.println("Pede um ifood e um zé delivery!");
//        } else if (temDinheiro || temCartao) { // se ele tem dinheiro ou cartão, ele só pede um ifood
//            System.out.println("Pede um ifood!");
//        } else { // se não (se ele não tem nem dinheiro nem cartão, ele não pede nada)
//            System.out.println("Não pede nada!");
//        }



//        String mensagem = (temDinheiro) ? "Pede um ifood!" : "Come o que tem em casa!";
//        System.out.println(mensagem);


//        if (temDinheiro) {
//            System.out.println("Pede um ifood!");
//        } else {
//            System.out.println("Come o que tem em casa!");
//        }


// EXERCÍCIO       4
//        boolean temIngresso = true;
//        boolean temDocumento = false;
//
//        if (temIngresso && temDocumento) {
//            System.out.println("Pode entrar no cinema!");
//        } else if (temIngresso || temDocumento) {
//            System.out.println("Falta alguma coisa para entrar.");
//        } else {
//            System.out.println("Não pode entrar no cinema.");
//        }


// EXERCÍCIO       5
//        boolean temFome = true;
//        boolean temDinheiro = false;
//
//        if (temFome && temDinheiro) {
//            System.out.println("Pede uma pizza!");
//        } else if (temFome) {
//            System.out.println("Procura algo na geladeira.");
//        } else {
//            System.out.println("Vai dormir.");
//        }


// EXERCÍCIO       6
//        boolean temPassagem = true;
//        boolean temPassaporte = true;
//
//        if (temPassagem && temPassaporte) {
//            System.out.println("Boa viagem!");
//        } else if (temPassagem || temPassaporte) {
//            System.out.println("Falta um documento.");
//        } else {
//            System.out.println("Não pode viajar.");
//        }


// EXERCÍCIO       7
//        boolean pagouMensalidade = false;
//        boolean temCarteirinha = true;
//
//        if (pagouMensalidade && temCarteirinha) {
//            System.out.println("Pode treinar.");
//        } else if (temCarteirinha) {
//            System.out.println("Precisa pagar a mensalidade.");
//        } else if (pagouMensalidade) {
//            System.out.println("Precisa apresentar a carteirinha.");
//        }  else {
//            System.out.println("Não pode entrar.");
//        }


// EXERCÍCIO       8
//        boolean temInternet = true;
//        boolean temConta = false;
//
//        if (temInternet && temConta) {
//            System.out.println("Assistindo Netflix!");
//        } else if (temInternet) {
//            System.out.println("Precisa criar uma conta.");
//        } else {
//            System.out.println("Sem internet.");
//        }


// EXERCÍCIO       9
//        boolean temDinheiro = true;
//        boolean temFome = true;
//
//        if (temDinheiro && temFome) {
//            System.out.println("Pede um hambúrguer!");
//        } else {
//            System.out.println("Não pede nada.");
//        }


// EXERCICIO       10
//        boolean temIngresso = true;
//        boolean eConvidado = false;
//
//        if (temIngresso && eConvidado) {
//            System.out.println("Pode entrar!");
//        } else if (temIngresso) {
//            System.out.println("Não foi convidado.");
//        } else if (eConvidado) {
//            System.out.println("Falta seu ingresso.");
//        } else {
//            System.out.println("Entrada negada.");
//        }


// EXERCICIO       11
//        boolean maiorDeIdade = true;
//        boolean temCarteira = false;
//
//        if (maiorDeIdade && temCarteira) {
//            System.out.println("Pode dirigir!");
//        } else if (maiorDeIdade && !temCarteira) {
//            System.out.println("Pode fazer a carteira!");
//        }     else {
//            System.out.println("Não pode dirigir.");
//        }


// EXERCICIO        12
//        boolean terminouTarefa = false;
//        boolean fimDeSemana = true;
//
//        if (terminouTarefa || fimDeSemana) {
//            System.out.println("Pode jogar!");
//        } else {
//            System.out.println("Primeiro faça a tarefa.");
//        }


// EXERCICIO       13
//        boolean comSono = false;
//
//        if (!comSono) {
//            System.out.println("Hora de estudar!");
//        } else {
//            System.out.println("Vai dormir.");
//        }


// EXERCICIO ORDEM DE PRIORIDADE
//        boolean temDinheiro = true;
//        boolean temTempo = false;
//        boolean eSextaFeira = true;
//
//        if (temDinheiro && (temTempo || eSextaFeira)) { // true && (true)
//            System.out.println("Bora sair!");
//        }


    }
}
