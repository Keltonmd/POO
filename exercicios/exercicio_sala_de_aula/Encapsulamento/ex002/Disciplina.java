import java.util.*;

public class Disciplina {

    // Método para exibir a interface de opções e obter a escolha do usuário
    static int interfac(){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a opção desejada\n[1] - Alterar nome do aluno\n[2] - Alterar matrícula do aluno\n[3] - Alterar média do aluno\n[4] - Verificar o resultado final do aluno\n[0] - Sair");
        int x = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner
        if (x == 0)
            scanf.close(); // Fecha o Scanner se a escolha for 0
        return x; // Retorna a escolha do usuário
    }

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        // Solicita informações do aluno ao usuário
        System.out.println("Digite o nome do aluno: ");
        String aluno = scanf.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanf.nextInt();
        System.out.println("Digite a média do aluno: ");
        Double media = scanf.nextDouble();

        // Cria um objeto da classe Aluno com as informações fornecidas
        Aluno aluno1 = new Aluno(aluno, matricula, media);

        // Loop para interagir com o usuário até que ele escolha sair
        do {
            // Exibe a interface de opções e obtém a escolha do usuário
            switch(interfac()){
                case 1: // Opção para alterar o nome do aluno
                    System.out.println("Digite o nome do aluno: ");
                    aluno = scanf.nextLine();
                    aluno1.setNome(aluno); // Chama o método para alterar o nome do aluno
                    break;
                case 2: // Opção para alterar a matrícula do aluno
                    System.out.println("Digite a matrícula do aluno: ");
                    matricula = scanf.nextInt();
                    aluno1.setMatricula(matricula); // Chama o método para alterar a matrícula do aluno
                    break;
                case 3: // Opção para alterar a média do aluno
                    System.out.println("Digite a média do aluno: ");
                    media = scanf.nextDouble();
                    aluno1.setMedia(media); // Chama o método para alterar a média do aluno
                    break;
                case 4: // Opção para verificar o resultado final do aluno
                    System.out.println(aluno1.resultadoFinal()); // Chama o método para verificar o resultado final do aluno e exibe o resultado
                    break;
                case 0: // Opção para sair do programa
                    scanf.close(); // Fecha o Scanner
                    return; // Sai do método main
            }
        } while(true); // Loop infinito
    }
}