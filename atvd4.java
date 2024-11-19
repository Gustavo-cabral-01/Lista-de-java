import java.util.ArrayList;
import java.util.Collections;
public class atvd4 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20);

        Collections.sort(numeros);

        System.out.println("Lista ordenada em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}


