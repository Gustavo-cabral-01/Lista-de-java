import java.util.HashMap;
import java.util.Map;
public class atvd8 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();


        pessoas.put("Ana", 25);
        pessoas.put("Carlos", 30);
        pessoas.put("Mariana", 22);


        System.out.println("Pares de nome e idade:");
        for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }
    }
}


