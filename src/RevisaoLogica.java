import java.util.Scanner;

public class RevisaoLogica {
    public static void main(String[] args) {

// 1 - Soma simples
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro número: ");
//        int numeroUm = scanner.nextInt();
//
//        System.out.print("Digite o segundo númeor: ");
//        int numeroDois = scanner.nextInt();
//
//        int soma = numeroUm + numeroDois;
//
//        System.out.println(numeroUm + " + " + numeroDois + " = " + soma);

// 2 - Número par ou ímpar

//Scanner scanner = new Scanner(System.in);
//
//System.out.print("Digite um número: ");
//int numero = scanner.nextInt();
//
//if (numero % 2 == 0) {
//    System.out.print("Este número é par.");
//} else {
//    System.out.print("Este número é ímpar.");
//}

// 3 - Maior de dois números
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro número: ");
//        int primeiroNumero = scanner.nextInt();
//
//        System.out.print("Digite o segundo número: ");
//        int segundoNumero = scanner.nextInt();
//
//        if (primeiroNumero > segundoNumero) {
//            System.out.print("o primeiro número (" + primeiroNumero + ") é maior que o segundo número (" + segundoNumero + ")");
//
//        } else {
//            System.out.print("o segundo número (" + segundoNumero + ") é maior que o primeiro número (" + primeiroNumero + ")");
//        }

// 4 - Conversão de temperaturas
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.print("Digite a temperatura que deseja fazer a conversão: ");
//       double temperatura = scanner.nextDouble();
//
//       System.out.print("Deseja fazer a conversão de Celsius > Fahrenheit (true ou false)? ");
//       boolean celsiusOuFahrenheit = scanner.nextBoolean();
//
//       if (celsiusOuFahrenheit) {
//           double fahrenheit = temperatura * 9 / 5 + 32;
//           System.out.print(temperatura + "º = " + fahrenheit + "F.");
//       } else {
//           double celsius = ((temperatura - 32) * 5 / 9);
//           System.out.print(temperatura + "F = " + celsius + "º.");
//       }

// 5 - Aprovação de aluno
//        Scanner scanner = new Scanner (System.in);
//
//        System.out.print("Qual foi sua nota na prova final? ");
//        double notaFinal = scanner.nextDouble();
//
//        if (notaFinal >= 7) {
//            System.out.print("Aprovado!");
//        } else if (notaFinal >= 5 && notaFinal < 7) {
//            System.out.print("Em recuperação...");
//        } else {
//            System.out.print("Reprovado!");
//        }

// 6 - Pode votar?
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Qual sua idade? ");
//        int idade = scanner.nextInt();
//
//        if (idade < 16) {
//            System.out.print("Você não pode votar ainda!");
//        }  else if ( idade == 16 || idade == 17) {
//            System.out.print("Você pode votar, se quiser.");
//        } else {
//            System.out.print("Você é obrigado(a) a votar!");
//        }

// 7 - Calculadora simples
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Vamos fazer uma conta juntos!");
//        System.out.print("Digite o primeiro número: ");
//        int primeiroNumero = scanner.nextInt();
//
//        System.out.print("Agora digite o segundo número: ");
//        int segundoNumero = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.print("Escolha qual operação você quer fazer: soma, subtração, multiplicação ou divisão? ");
//        String operacao = scanner.nextLine();
//
//        int totalSoma = primeiroNumero + segundoNumero;
//        int totalSub = primeiroNumero - segundoNumero;
//        int totalMulti = primeiroNumero * segundoNumero;
//        int totalDiv = primeiroNumero / segundoNumero;
//
//        switch (operacao) {
//            case "soma":
//                System.out.print(primeiroNumero + " + " + segundoNumero + " = " + totalSoma);
//                break;
//
//            case "subtração":
//                System.out.print(primeiroNumero + " - " + segundoNumero + " = " + totalSub);
//                break;
//
//            case "multiplicação":
//                System.out.print(primeiroNumero + " * " + segundoNumero + " = " + totalMulti);
//                break;
//
//            case "divisão":
//                System.out.print(primeiroNumero + " / " + segundoNumero + " = " + totalDiv);
//                break;
//
//        }

// 8 - Soma de 1 até numero
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        int soma = 0;
//
//        for (int i = 1; i <= numero; i++) {
//            soma += i;
//
//        }
//        System.out.print(soma);
//

// 9 - Tabuada
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            int resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }

// 10 - Contagem regressiva
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        for (int i = numero; i >= 0; i--) {
//            System.out.println(i);
//        }

// 11 - Números pares
//             for (int i = 2; i <= 100; i += 2) {
//                 System.out.println(i);
//        }

// 12 - Número primo

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        boolean ehPrimo = true;
//
//        for (int i = 2; i < numero; i++) {
//            if (numero % i == 0) {
//                ehPrimo = false;
//                break; // aqui faz sentido!
//            }
//        }
//
//        if (ehPrimo && numero > 1) {
//            System.out.println("É primo");
//        } else {
//            System.out.println("Não é primo");
//        }

        }
    }



