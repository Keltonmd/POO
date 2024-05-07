import java.util.*;

public class Contas {

    // Método para exibir o menu de opções
    static int interfac(){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a opção desejada\n[1] - Depositar\n[2] - Sacar\n[3] - Informações da conta\n[0] - Sair");
        int x = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do scanner
        if (x == 0)
            scanf.close(); // Fecha o scanner se a opção for sair
        return x;
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Declaração das variáveis
        String nome, cpf, endereco, telefone;
        int numeroDaConta;
        Double renda;
        float deposito, saque;

        // Coleta dos dados do cliente
        System.out.println("Digite o nome do cliente: ");
        nome = scanf.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        cpf = scanf.nextLine();

        System.out.println("Digite o endereco do cliente: ");
        endereco = scanf.nextLine();

        System.out.println("Digite o telefone do cliente: ");
        telefone = scanf.nextLine();

        System.out.println("Digite a renda do cliente:");
        renda = scanf.nextDouble();

        // Criação de um objeto Pessoa com os dados coletados
        Pessoa pessoa = new Pessoa(nome, cpf, endereco, telefone, renda);

        // Coleta do número da conta do cliente
        System.out.println("Digite o numero da conta do cliente: ");
        numeroDaConta = scanf.nextInt();

        // Criação de um objeto ContaBancaria com os dados coletados
        ContaBancaria cliente1 = new ContaBancaria(pessoa, numeroDaConta);

        // Loop para exibir o menu e executar as operações escolhidas pelo usuário
        while (true) {
            switch(interfac()){
                case 1: // Opção para depositar
                    System.out.println("Digite o valor para depositar: ");
                    deposito = scanf.nextFloat();
                    if (cliente1.depositar(deposito)) {
                        System.out.println("Deposito realizado com sucesso!");
                    } else{
                        System.out.println("Deposito não realizado com sucesso!");
                    }
                    break;
                case 2: // Opção para sacar
                    System.out.println("Digite o valor do saque: ");
                    saque = scanf.nextFloat();
                    if (cliente1.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else{
                        System.out.println("Saque não realizado com sucesso!");
                    }
                    break;
                case 3: // Opção para exibir informações da conta
                    pessoa = cliente1.getCliente(); // Obtém os dados do cliente associado à conta
                    System.out.println(pessoa.Informacoes()+"\nNumero da conta: " + cliente1.getNumeroDaConta() + "\nSaldo: " + cliente1.getSaldo()+"R$");
                    break;
                case 0: // Opção para sair do programa
                    scanf.close(); // Fecha o scanner
                    return;
            }
        }
    }
}