import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário

        String nome, cpf, endereco; // Variáveis para armazenar as informações do aluno
        int matricula; // Variável para armazenar o número da matrícula do aluno

        // Coleta as informações do primeiro aluno
        System.out.println("Digite o nome do Aluno: ");
        nome = scanf.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        cpf = scanf.nextLine();
        System.out.println("Digite o endereço do Aluno: ");
        endereco = scanf.nextLine();
        System.out.println("Digite o número da matrícula do aluno: ");
        matricula = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Cria um objeto da classe Aluno com as informações do primeiro aluno
        Aluno aluno1 = new Aluno(matricula, nome, cpf, endereco);

        // Imprime os dados do primeiro aluno
        System.out.println(aluno1.toString());
        System.out.println();

        // Coleta as informações do segundo aluno
        System.out.println("Digite o nome do Aluno: ");
        nome = scanf.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        cpf = scanf.nextLine();
        System.out.println("Digite o endereço do Aluno: ");
        endereco = scanf.nextLine();
        System.out.println("Digite o número da matrícula do aluno: ");
        matricula = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner

        // Cria um objeto da classe Aluno com as informações do segundo aluno
        Aluno aluno2 = new Aluno(matricula, nome, cpf, endereco);

        // Imprime os dados do segundo aluno
        System.out.println(aluno2.toString());
        System.out.println();

        scanf.close(); // Fecha o Scanner após a entrada de dados
    }
}