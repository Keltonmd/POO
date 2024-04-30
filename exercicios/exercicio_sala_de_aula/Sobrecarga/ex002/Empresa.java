import java.util.*;

// Classe para gerenciar as interações financeiras
class Financeiro {

    // Método para exibir o menu de opções e obter a escolha do usuário
    static int interfac() {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a opção desejada\n[1] - Salario funcionario 1\n[2] - Salario Funcionario 2\n[0] - Sair");
        int x = scanf.nextInt(); // Obtém a escolha do usuário
        scanf.nextLine(); // Limpa o buffer do scanner
        if (x == 0)
            scanf.close(); // Fecha o scanner se a escolha for 0 (Sair)
        return x; // Retorna a escolha do usuário
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        String nome;
        Double salarioBase, totalDeVendas;
        int tempoDeServico;

        // Obtém informações do primeiro funcionário
        System.out.println("Digite o nome do funcionario: ");
        nome = scanf.nextLine();

        System.out.println("Digite o tempo de serviço do funcionario: ");
        tempoDeServico = scanf.nextInt();

        System.out.println("Digite o salario base do funcionario: ");
        salarioBase = scanf.nextDouble();

        scanf.nextLine(); // Limpa o buffer do scanner

        // Cria um objeto Funcionario com as informações do primeiro funcionário
        Funcionario funcionario1 = new Funcionario(nome, salarioBase, tempoDeServico);

        // Obtém informações do segundo funcionário
        System.out.println("Digite o nome do funcionario: ");
        nome = scanf.nextLine();

        System.out.println("Digite o tempo de serviço do funcionario: ");
        tempoDeServico = scanf.nextInt();

        System.out.println("Digite o salario base do funcionario: ");
        salarioBase = scanf.nextDouble();

        scanf.nextLine(); // Limpa o buffer do scanner

        // Cria um objeto Funcionario com as informações do segundo funcionário
        Funcionario funcionario2 = new Funcionario(nome, salarioBase, tempoDeServico);

        // Loop para exibir o menu de opções e realizar operações financeiras
        do {
            // Exibe o menu de opções e obtém a escolha do usuário
            switch (interfac()) {
                case 1: // Opção para mostrar o salário do primeiro funcionário
                    // Exibe as informações do primeiro funcionário e seu salário
                    System.out.println("Nome: " + funcionario1.getNome() + "\nTempo de serviço: " + funcionario1.getTempoDeServico() + "\nSalario base: " + funcionario1.getSalarioBase() + "\nSalario:" + funcionario1.mostrarSalario());
                    break;
                case 2: // Opção para calcular o salário do segundo funcionário com base nas vendas
                    System.out.println("Digite o total de vendas: ");
                    totalDeVendas = scanf.nextDouble();
                    scanf.nextLine(); // Limpa o buffer do scanner
                    // Exibe as informações do segundo funcionário e seu salário com base nas vendas
                    System.out.println("Nome: " + funcionario2.getNome() + "\nTempo de serviço: " + funcionario2.getTempoDeServico() + "\nSalario base: " + funcionario2.getSalarioBase() + "\nSalario:" + funcionario2.mostrarSalario(totalDeVendas));
                    break;
                case 0: // Opção para sair do programa
                    scanf.close(); // Fecha o scanner
                    return; // Retorna ao método chamador (encerra o programa)
            }
        } while (true); // Loop infinito, continuará exibindo o menu até que o usuário escolha sair
    }
}
