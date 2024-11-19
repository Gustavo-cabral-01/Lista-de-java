import java.util.ArrayList;

public class atvd3 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");


        String elementoBuscado = "banana";

        if (frutas.contains(elementoBuscado)) {
            int indice = frutas.indexOf(elementoBuscado);
            System.out.println("O elemento \"" + elementoBuscado + "\" está na posição: " + indice);
        } else {
            System.out.println("O elemento \"" + elementoBuscado + "\" não foi encontrado na lista.");
        }
    }
}


