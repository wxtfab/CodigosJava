public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // avalia se X e Y são true, só é true se os dois forem true
        System.out.println(x || y); // avalia se X ou Y são true, é true se pelo menos um for true
        System.out.println(!x); // negação, inverte o valor de X, se X for true, !X é false, se X for false, !X é true

    }

}
