import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário

        String descricao; // Variável para armazenar a descrição do produto
        Double preco; // Variável para armazenar o preço do produto
        int numero, quantidade; // Variáveis para armazenar o número e a quantidade do produto

        // Coleta as informações da primeira fatura
        System.out.println("Digite a descrição do produto: ");
        descricao = scanf.nextLine();
        System.out.println("Digite o número do produto: ");
        numero = scanf.nextInt();
        System.out.println("Digite o preço do produto: ");
        preco = scanf.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Cria um objeto da classe Fatura com as informações da primeira fatura
        Fatura fatura1 = new Fatura(descricao, numero, quantidade, preco);

        // Imprime as informações da primeira fatura
        System.out.printf("\n%s\nQuantidade: %d\nPreço: R$%.2f\nValor da fatura: R$%.2f\n", fatura1.descricao, fatura1.quantidade, fatura1.preco, fatura1.getValorDaFatura());
        System.out.println();

        // Coleta as informações da segunda fatura
        System.out.println("Digite a descrição do produto: ");
        descricao = scanf.nextLine();
        System.out.println("Digite o número do produto: ");
        numero = scanf.nextInt();
        System.out.println("Digite o preço do produto: ");
        preco = scanf.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Cria um objeto da classe Fatura com as informações da segunda fatura
        Fatura fatura2 = new Fatura(descricao, numero, quantidade, preco);

        // Imprime as informações da segunda fatura
        System.out.printf("\n%s\nQuantidade: %d\nPreço: R$%.2f\nValor da fatura: R$%.2f\n", fatura2.descricao, fatura2.quantidade, fatura2.preco, fatura2.getValorDaFatura());
        System.out.println();

        scanf.close(); // Fecha o Scanner após a entrada de dados
    }
}
