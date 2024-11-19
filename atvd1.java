import java.util.ArrayList;

public class atvd1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);


        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros.get(i));
        }
    }
}