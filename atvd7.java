import java.util.HashSet;

public class atvd7 {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        int numeroBuscado = 15;

        if (numeros.contains(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " está presente no conjunto.");
        } else {
            System.out.println("O número " + numeroBuscado + " não está presente no conjunto.");
        }
    }
}



