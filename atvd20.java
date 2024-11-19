import java.util.HashMap;
import java.util.Map;

public class atvd20 {

    public static void main(String[] args) {

        Map<Integer, String> diasDaSemana = new HashMap<>();
        diasDaSemana.put(1, "Segunda-feira");
        diasDaSemana.put(2, "Terça-feira");
        diasDaSemana.put(3, "Quarta-feira");
        diasDaSemana.put(4, "Quinta-feira");
        diasDaSemana.put(5, "Sexta-feira");


        diasDaSemana.put(3, "Quarta-feira");


        System.out.println("Mapa após a modificação:");
        for (Map.Entry<Integer, String> entry : diasDaSemana.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
    }
}


