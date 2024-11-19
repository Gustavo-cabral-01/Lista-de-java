import java.util.LinkedList;

public class atvd12 {
    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        lista.addFirst(0);
        lista.addLast(6);

        System.out.println("Lista após adicionar 0 no início e 6 no final:");
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}


