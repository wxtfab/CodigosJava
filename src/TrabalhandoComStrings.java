public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Fabíola";
        String sobrenome = " Schulds";
        String sobrenomeDois = " Krauss";

        int tamanhoString = nome.length();
        String nomeCompleto = nome + sobrenome + sobrenomeDois;



        System.out.println("Olá " + nome.toLowerCase() + ", seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("Nome completo: " + nomeCompleto);
    }

}
