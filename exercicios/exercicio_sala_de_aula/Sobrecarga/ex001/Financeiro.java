import java.util.*; // Importa a classe Scanner

public class Financeiro {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        String nomeCliente;
        Double renda;

        Emprestimo emprestimo = new Emprestimo(); // Cria um objeto da classe Emprestimo

        System.out.println("Digite o nome do cliente:"); // Solicita o nome do cliente
        nomeCliente = scanf.nextLine(); // Lê o nome do cliente

        System.out.println("Digite a renda do cliente:"); // Solicita a renda do cliente
        renda = scanf.nextDouble(); // Lê a renda do cliente
        scanf.close(); // Fecha o objeto Scanner, liberando os recursos

        System.out.println(); // Imprime uma linha em branco

        // Define o nome e a renda do cliente no objeto emprestimo
        emprestimo.setNomeCliente(nomeCliente);
        emprestimo.setRenda(renda);

        // Realiza três chamadas de método da classe Emprestimo para calcular diferentes empréstimos
        System.out.print("Chamada sem parâmetro: " + emprestimo.calculaEmprestimo());
        System.out.print("Chamada com parâmetro inteiro 5: " + emprestimo.calculaEmprestimo(5));
        System.out.print("Chamada com parâmetro Double 5.0: " + emprestimo.calculaEmprestimo(5.0));
        System.out.println(); // Imprime uma linha em branco
    }
}
