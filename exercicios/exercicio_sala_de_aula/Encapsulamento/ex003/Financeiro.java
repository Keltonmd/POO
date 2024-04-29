import java.util.*;

class Financeiro {

    // Método para exibir o menu de opções e ler a escolha do usuário
    static int interfac(){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a opção desejada\n[1] - Alterar código do Boleto\n[2] - Alterar descrição do Boleto\n[3] - Alterar dia de vencimento do Boleto\n[4] - Alterar valor do Boleto\n[5] - Verificar dados do Boleto\n[6] - Pagar Boleto\n[0] - Sair");
        int x = scanf.nextInt(); // Lê a escolha do usuário
        scanf.nextLine(); // Limpa o buffer do teclado
        if (x == 0)
            scanf.close(); // Fecha o scanner se a escolha for sair
        return x; // Retorna a escolha do usuário
    }

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        // Solicita informações para criar um novo boleto
        System.out.println("Digite a descrição do Boleto: ");
        String descricao = scanf.nextLine();
        System.out.println("Digite o código do Boleto: ");
        int codigo = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do teclado
        System.out.println("Digite o dia de vencimento do Boleto: ");
        int diaDeVencimento = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do teclado
        System.out.println("Digite o valor do boleto: ");
        Double valor = scanf.nextDouble();
        scanf.nextLine(); // Limpa o buffer do teclado

        // Cria um novo objeto Boleto com as informações fornecidas
        Boleto boleto1 = new Boleto(codigo, descricao, diaDeVencimento, valor);

        // Loop para interação com o usuário
        do {
            // Exibe o menu de opções e lê a escolha do usuário
            switch (interfac()) {
                case 1: // Opção para alterar o código do boleto
                    System.out.println("Digite o código do Boleto: ");
                    codigo = scanf.nextInt();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    boleto1.setCodigo(codigo); // Atualiza o código do boleto
                    break;
                case 2: // Opção para alterar a descrição do boleto
                    System.out.println("Digite a descrição do Boleto: ");
                    descricao = scanf.nextLine();
                    boleto1.setDescricao(descricao); // Atualiza a descrição do boleto
                    break;
                case 3: // Opção para alterar o dia de vencimento do boleto
                    System.out.println("Digite o dia de vencimento do Boleto: ");
                    diaDeVencimento = scanf.nextInt();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    boleto1.setDiaDeVencimento(diaDeVencimento); // Atualiza o dia de vencimento do boleto
                    break;
                case 4: // Opção para alterar o valor do boleto
                    System.out.println("Digite o valor do boleto: ");
                    valor = scanf.nextDouble();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    boleto1.setValor(valor); // Atualiza o valor do boleto
                    break;
                case 5: // Opção para verificar os dados do boleto
                    System.out.println(boleto1.exibir()); // Exibe os dados do boleto
                    break;
                case 6: // Opção para pagar o boleto
                    System.out.println("Digite o dia do pagamento do Boleto: ");
                    int dia = scanf.nextInt();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    System.out.println("Digite o valor para pagar o Boleto: ");
                    Double valorPago = scanf.nextDouble();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    System.out.println("Digite o desconto desse Boleto:");
                    Double desconto = scanf.nextDouble();
                    scanf.nextLine(); // Limpa o buffer do teclado
                    boleto1.pagar(dia, desconto, valorPago); // Realiza o pagamento do boleto
                    break;
                case 0: // Opção para sair do programa
                    scanf.close(); // Fecha o scanner
                    return;
            }
        } while(true); // Loop infinito para interação contínua com o usuário
    }    
}