package LogicaDeProgramacao;

import java.util.Scanner;

public class For {

    public static void main (String[] args) {

//        int cont = 0;
//        for (cont = 0; cont < 5; cont ++) {
//            System.out.println("Contador do for: " + cont);
//        }

// Exercício 1 - Contagem Simples
//            for (int i = 1; i <= 10; i++ ) {
//                System.out.println(i);
//            }

// Exercício 2 - Contagem Regressiva
//             for (int i = 10; i >= 1; i--) {
//                 System.out.println(i);
//        }

// Exercício 3 - Números Pares
//               for (int i = 0; i <= 20; i += 2) {
//                   System.out.println(i);
//               }

// Exercício 4 - Tabuada Simples
//                 Scanner scanner = new Scanner(System.in);
//
//                 System.out.println("Digite um número: ");
//                 int numero = scanner.nextInt();
//
//                 for (int i = 1; i <= 10; i++) {
//                     int resultado = numero * i;
//                     System.out.println(numero + " x " + i + " = " + resultado);
//
//        }

// Exercício - Soma de Números Pares de 1 a 10
//        int soma = 0; // variável para guardar a soma
//
//          for (int i = 2; i <= 10; i += 2) { // pra fazer os pares
//               soma += i; // soma = recebe ela mesma + o valor de i
//          } System.out.println(soma);

// Exercício - Contador para saber quantos números pares de 1 a 50
//              int contador = 0;
//              for (int i = 1; i <= 50; i++) { // para cada número de 1 a 50
//                  if ( i % 2 == 0) { // se for par
//                      contador++; // aumenta o contador em 1
//                  }
//              } System.out.print(contador);

// Exercício - Soma dos múltiplos de 3 de 1 a 50
//                 int soma = 0;
//                 for (int i = 1; i <=50; i++) { // para cada número entre 1 e 50
//                     if (i % 3 == 0) {  // se o número for múltiplo de 3
//                         soma += i; // então você soma eles, só os múltiplos de 3
//                     }
//                 } System.out.println(soma);

 // Exercício - Contar quantos números pares tem de 1 a 100
//                 int contador = 0;
//                 for (int i = 1; i <= 100; i++) {
//                     if (i % 2 != 0) {
//                         contador++;
//                     }
//                 } System.out.println(contador);

// Exercício - Mostrar divisores de um número

//                  Scanner scanner = new Scanner(System.in);
//
//                  System.out.print("Digite um número: ");
//                  int numero = scanner.nextInt();
//
//                  for (int i = 1; i <= numero; i++) { // para cada número de 1 até o número digitado
//                      if (numero % i == 0) { // se ele divide certinho (resto 0)
//                          System.out.print(i + " "); // mostra ele
//                      }
//                  }

                  Scanner scanner = new Scanner(System.in);

                  System.out.print("Digite um número: ");
                  int numero = scanner.nextInt();

                  int soma = 0;

                  for (int i = 1; i <= numero; i++) { // para cada número de 1 até o número digitado
                      soma += i; // soma tudo
                  } System.out.print(soma); //mostra o resultado


    }
}
