public class Aluno {
    int matricula; // Variável de instância para armazenar a matrícula do aluno
    String nome, cpf, endereco; // Variáveis de instância para armazenar o nome, CPF e endereço do aluno

    // Construtor da classe Aluno que recebe a matrícula, nome, CPF e endereço como parâmetros
    public Aluno(int matricula, String nome, String cpf, String endereco){
        // Inicializa os atributos da classe com os valores fornecidos
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Método toString() para retornar uma representação em string dos dados do aluno
    public String toString(){
        // Retorna uma string contendo os dados do aluno formatados
        return "\nNome do aluno: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nMatrícula: " + matricula;
    }
}
