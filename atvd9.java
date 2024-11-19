import java.util.HashMap;

public class atvd9 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();


        pessoas.put("Ana", 25);
        pessoas.put("Carlos", 30);
        pessoas.put("Mariana", 22);

        String nomeBuscado = "João";

        if (pessoas.containsKey(nomeBuscado)) {
            int idade = pessoas.get(nomeBuscado);
            System.out.println("A idade de " + nomeBuscado + " é: " + idade);
        } else {
            System.out.println("O nome \"" + nomeBuscado + "\" não foi encontrado no mapa.");
        }
    }
}


