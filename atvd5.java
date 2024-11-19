import java.util.HashSet;

public class atvd5 {

        public static void main(String[] args) {

            HashSet<Integer> numeros = new HashSet<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(10);
            numeros.add(30);
            numeros.add(40);


            System.out.println("Conjunto (HashSet) sem duplicações:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
    }

