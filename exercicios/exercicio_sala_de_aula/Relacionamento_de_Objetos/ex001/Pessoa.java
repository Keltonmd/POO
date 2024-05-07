public class Pessoa {
    // Declaração dos atributos da classe
    private String nome; // Nome da pessoa
    private Endereco endereco; // Objeto do tipo Endereco que armazena o endereço da pessoa
    private String telefone; // Número de telefone da pessoa
    
    // Construtor da classe Pessoa
    public Pessoa(String nome, Endereco endereco, String telefone) {
        // Inicializa os atributos da classe com os valores passados como argumento
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Métodos getters e setters para os atributos da classe
    public String getNome() {
        return nome; // Retorna o nome da pessoa
    }
    
    public void setNome(String nome) {
        this.nome = nome; // Define o nome da pessoa
    }
    
    public Endereco getEndereco() {
        return endereco; // Retorna o endereço da pessoa
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco; // Define o endereço da pessoa
    }
    
    public String getTelefone() {
        return telefone; // Retorna o telefone da pessoa
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone; // Define o telefone da pessoa
    }
}
