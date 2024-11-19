import java.util.LinkedHashMap;
import java.util.Map;

public class atvd18 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();


        mapa.put("João", 25);
        mapa.put("Maria", 30);
        mapa.put("Carlos", 28);
        mapa.put("Ana", 22);
        mapa.put("Beatriz", 27);


        System.out.println("Mapa original:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        String primeiraChave = mapa.keySet().iterator().next();
        mapa.remove(primeiraChave);


        System.out.println("\nMapa após remover o primeiro elemento:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


