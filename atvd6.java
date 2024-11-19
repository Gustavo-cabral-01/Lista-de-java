import java.util.HashSet;

public class atvd6 {
    public static void main(String[] args) {

        HashSet<String> cidades = new HashSet<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Salvador");


        System.out.println("Cidades no conjunto:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}


