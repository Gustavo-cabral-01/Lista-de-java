import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class atvd17 {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(3);
        hashSet.add(7);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(7);

        System.out.println("Elementos no HashSet (sem ordem garantida):");
        System.out.println(hashSet);

        System.out.println("\nElementos no TreeSet (ordenados):");
        System.out.println(treeSet);


        System.out.println("\nDiferença:");
        System.out.println("1. O HashSet não garante a ordem dos elementos. Os elementos são armazenados de forma aleatória.");
        System.out.println("2. O TreeSet garante a ordenação dos elementos, armazenando-os automaticamente em ordem crescente.");
    }
}


