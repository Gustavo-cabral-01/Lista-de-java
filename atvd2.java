import java.util.ArrayList;

public class atvd2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        numeros.remove(Integer.valueOf(30));

        System.out.println("Lista após remover o número 30:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}


