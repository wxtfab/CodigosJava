package LogicaDeProgramacao;

public class ExercicioFixacao{

    public static void main(String[] args) {

        // 1️⃣ Converter int para double
        int idade = 25;
        double idadeDouble = idade;

        // 2️⃣ Converter double para int
        double preco = 19.99;
        int precoInteiro = (int) preco;

        // 3️⃣ Converter String para int (usar Integer.parseInt()) pois int é tipo primitivo.
        String numeroTexto = "150";
        int numero = Integer.parseInt(numeroTexto);

        // 4️⃣ Converter int para String
        Integer ano = 2025;
        String anoTexto = ano.toString();

        // Saída
        System.out.println("Idade em double: " + idadeDouble);
        System.out.println("Preço inteiro: " + precoInteiro);
        System.out.println("Número convertido: " + numero);
        System.out.println("Ano em texto: " + anoTexto);
    }
}