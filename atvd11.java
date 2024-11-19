import java.util.HashMap;
import java.util.Map;

    class pessoa {
        private String nome;
        private int idade;


        public pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade;
        }
    }

    public class atvd11 {
        public static void main(String[] args) {

            HashMap<String, pessoa> mapaDePessoas = new HashMap<>();

            mapaDePessoas.put("Ana", new pessoa("Ana", 25));
            mapaDePessoas.put("Carlos", new pessoa("Carlos", 30));
            mapaDePessoas.put("Mariana", new pessoa("Mariana", 22));


            System.out.println("Pessoas no mapa:");
            for (Map.Entry<String, pessoa> entry : mapaDePessoas.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }


