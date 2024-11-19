
    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

    // Classe Pessoa com os atributos nome e idade
    class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // Métodos getters
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        // Método toString para imprimir os detalhes da pessoa
        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade;
        }
    }

    public class atvd13 {
        public static void main(String[] args) {

            ArrayList<pessoa> listaPessoas = new ArrayList<>();
            listaPessoas.add(new pessoa("Ana", 25));
            listaPessoas.add(new pessoa("Carlos", 30));
            listaPessoas.add(new pessoa("Mariana", 22));
            listaPessoas.add(new pessoa("João", 28));
            listaPessoas.add(new pessoa("Beatriz", 26));


            Collections.sort(listaPessoas, new Comparator<pessoa>() {
                @Override
                public int compare(pessoa p1, pessoa p2) {
                    return Integer.compare(p1.getIdade(), p2.getIdade());
                }
            });

            System.out.println("Lista de pessoas ordenada por idade (ordem crescente):");
            for (pessoa pessoa : listaPessoas) {
                System.out.println(pessoa);
            }
        }
    }


