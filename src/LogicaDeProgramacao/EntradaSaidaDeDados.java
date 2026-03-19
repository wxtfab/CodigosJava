package LogicaDeProgramacao;

import java.util.Scanner; // isso quer dizer que quero usar a classe Scanner no meu programa
// ele SEMPRE tem que ficar aqui encima, é  estrutural

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

//        System.out.println("Olá, eu faço impressão e pulo a linha.");
//        System.out.print("Olá, eu faço a impressão na mesma linha.");
//        System.out.printf("Olá, eu faço a impressão formatada");

        // só conseguimos fazer entrada de dados usando essa classe Scanner
        // inicializa o objeto scanner
        Scanner scanner = new Scanner(System.in);
        // criando um objeto, cria o leitor de teclado
        // system.out = saída de dados
        // system.in = entrada de dados

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine(); // possibilidade de colocar qualquer valor dentro da variável nome
        // variável nome não tem um valor estático, pois é atribuído em "tempo de execução"
        // String = nextLine
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        // int = nextInt
        // double = nextDouble
        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado sim(true) ou não(false): ");
        boolean empregado = scanner.nextBoolean(); // vai ler se foi digitado true or false
        System.out.println("Olá, soou " + nome + " tenho " + idade + " anos" + " e estou empregado " + empregado);

    }

}
