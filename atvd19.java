import java.util.ArrayList;

public class atvd19 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        lista1.addAll(lista2);

        System.out.println("Lista resultante após unir as duas listas:");
        System.out.println(lista1);
    }
}


