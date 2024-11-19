import java.util.LinkedList;
import java.util.Queue;

public class atvd14 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();


        for (int i = 1; i <= 5; i++) {
            fila.add(i);
        }


        System.out.println("Removendo elementos da fila:");
        while (!fila.isEmpty()) {
            int numeroRemovido = fila.poll();
            System.out.println("Elemento removido: " + numeroRemovido);
        }
    }
}


