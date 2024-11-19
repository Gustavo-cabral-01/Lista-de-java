import java.util.TreeSet;

public class atvd16 {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20);


        System.out.println("Elementos no TreeSet (sem duplicatas e ordenados):");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}


