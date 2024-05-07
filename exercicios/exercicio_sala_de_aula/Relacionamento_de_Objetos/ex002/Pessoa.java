public class Pessoa {
    // Declaração dos atributos da classe
    private String nome; // Nome da pessoa
    private String cpf; // CPF da pessoa
    private String endereco; // Endereço da pessoa
    private String telefone; // Número de telefone da pessoa
    private Double renda; // Renda da pessoa

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, String endereco, String telefone, Double renda) {
        // Inicializa os atributos da classe com os valores passados como argumento
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.renda = renda;
    }

    // Método para obter informações da pessoa
    public String Informacoes(){
        // Retorna uma string formatada contendo as informações da pessoa
        return "Nome: " + nome + "\ncpf: " + cpf + "\nendereco: " + endereco + "\ntelefone: " + telefone + "\nrenda: " + renda + "R$";
    }

    // Métodos getters e setters para os atributos da classe
    public String getNome() {
        return nome; // Retorna o nome da pessoa
    }

    public void setNome(String nome) {
        this.nome = nome; // Define o nome da pessoa
    }

    public String getCpf() {
        return cpf; // Retorna o CPF da pessoa
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; // Define o CPF da pessoa
    }

    public String getEndereco() {
        return endereco; // Retorna o endereço da pessoa
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; // Define o endereço da pessoa
    }

    public String getTelefone() {
        return telefone; // Retorna o número de telefone da pessoa
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone; // Define o número de telefone da pessoa
    }

    public Double getRenda() {
        return renda; // Retorna a renda da pessoa
    }

    public void setRenda(Double renda) {
        this.renda = renda; // Define a renda da pessoa
    }
}