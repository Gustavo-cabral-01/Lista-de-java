import java.util.Stack;

public class atvd15 {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();


        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");


        System.out.println("Desempilhando elementos da pilha:");
        while (!pilha.isEmpty()) {
            String valorDesempilhado = pilha.pop();  // desempilha e retorna o elemento do topo
            System.out.println("Elemento desempilhado: " + valorDesempilhado);
        }
    }
}


