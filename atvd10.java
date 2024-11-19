import java.util.Map;
import java.util.TreeMap;

public class atvd10 {
    public static void main(String[] args) {

        TreeMap<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("Mariana", 22);
        pessoas.put("Carlos", 30);
        pessoas.put("Ana", 25);
        pessoas.put("João", 28);
        pessoas.put("Beatriz", 26);


        System.out.println("Pares de nome e idade (em ordem alfabética das chaves):");
        for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }
    }
}


