import java.util.*;

public class Empresa {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário

        // Cria três objetos Funcionario
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();

        // Coleta informações do primeiro funcionário
        System.out.println("Digite o nome do primeiro funcionario: ");
        func1.nome = scanf.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas pelo primeiro funcionario: ");
        func1.horasTrabalhadas = scanf.nextDouble();
        System.out.println("Digite o valor da hora trabalhada do primeiro funcionario: ");
        func1.valorDaHora = scanf.nextDouble();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Coleta informações do segundo funcionário
        System.out.println("Digite o nome do segundo funcionario: ");
        func2.nome = scanf.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas pelo segundo funcionario: ");
        func2.horasTrabalhadas = scanf.nextDouble();
        System.out.println("Digite o valor da hora trabalhada do segundo funcionario: ");
        func2.valorDaHora = scanf.nextDouble();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Coleta informações do terceiro funcionário
        System.out.println("Digite o nome do terceiro funcionario: ");
        func3.nome = scanf.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas pelo terceiro funcionario: ");
        func3.horasTrabalhadas = scanf.nextDouble();
        System.out.println("Digite o valor da hora trabalhada do terceiro funcionario: ");
        func3.valorDaHora = scanf.nextDouble();
        
        scanf.close(); // Fecha o Scanner após a entrada de dados

        // Imprime os salários finais dos funcionários
        System.out.println("PRIMEIRO FUNCIONARIO\n"+func1.nome+" --- Salario: R$"+func1.salariofinal()+"\nSEGUNDO FUNCIONARIO\n"+func2.nome+" --- Salario: R$"+func2.salariofinal()+"\nTERCEIRO FUNCIONARIO\n"+func3.nome+" --- Salario: R$"+func3.salariofinal());
    }
}
