package LogicaDeProgramacao;

public class ConversaoTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero; //(não é ideal esse nome) mas essa é uma conversão implícita, ou seja, o Java faz a conversão automaticamente, porque não há perda de informação, ou seja, o número 10 se torna 10.0, mas não perde a parte decimal, porque não tem parte decimal.

// de int para double, não precisa fazer nada
// de double para int precisa fazer pois o int é inferior ao double.

        double d2 = 10.5; // quando converte para inteiro, perde 0.5, ou seja, perde a parte decimal, porque o tipo int não tem parte decimal, então o número 10.5 se torna 10, perdendo a parte decimal, por isso é necessário fazer um cast, para dizer que queremos fazer a conversão, mesmo sabendo que pode haver perda de informação.
         int int2 = (int) d2; // isso aqui se chama cast, é uma conversão explícita, ou seja, o programador tem que dizer que quer fazer a conversão, porque pode haver perda de informação, como no caso do double para int, onde o número 10.5 se torna 10, perdendo a parte decimal.

// converter de número para string tem que usar o Integer

       // converter de int para string não é possível diretamente, porque são tipos de dados diferentes, mas podemos usar o método toString() da classe Integer para converter o número inteiro para string, ou seja, o número 10 se torna "10", que é uma string, ou seja, um texto. O mesmo vale para o double, onde o número 10.0 se torna "10.0", que é uma string.
       // pois o tipo int é um tipo primitivo, ou seja, não é um objeto, então não tem métodos, mas a classe Integer é um wrapper, ou seja, é uma classe que envolve o tipo int, e tem métodos para converter o número inteiro para string, ou seja, o número 10 se torna "10", que é uma string. O mesmo vale para o double, onde o número 10.0 se torna "10.0", que é uma string.
        Integer numeroInteger = 10; // classe wrapper, ou seja, é uma classe que envolve o tipo int, e tem métodos para converter o número inteiro para string, ou seja, o número 10 se torna "10", que é uma string. O mesmo vale para o double, onde o número 10.0 se torna "10.0", que é uma string.
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroInteger.toString(); // transformando o número double em string, ou seja, o número 10.0 se torna "10.0", que é uma string.



        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois); // transformando a string "1234" em um número inteiro, ou seja, o número 1234 se torna 1234, que é um número inteiro.
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois); // transformando a string "1234" em um número double, ou seja, o número 1234 se torna 1234.0, que é um número double.
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);

        Long numerolong = 10L;
        String numeroStringLong = numerolong.toString();


        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString);
        System.out.println(numeroStringDois + " " + numeroConvertido);



    }

}
