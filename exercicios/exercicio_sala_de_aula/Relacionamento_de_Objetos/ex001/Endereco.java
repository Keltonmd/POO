public class Endereco {
    // Declaração dos atributos da classe
    private String logadouro; // Logradouro (rua, avenida, etc.)
    private String cidade; // Cidade
    private String estado; // Estado

    // Construtor da classe Endereco
    public Endereco(String logadouro, String cidade, String estado) {
        // Inicializa os atributos da classe com os valores passados como argumento
        this.logadouro = logadouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Métodos getters e setters para os atributos da classe
    public String getLogadouro() {
        return logadouro; // Retorna o logradouro
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro; // Define o logradouro
    }

    public String getCidade() {
        return cidade; // Retorna a cidade
    }

    public void setCidade(String cidade) {
        this.cidade = cidade; // Define a cidade
    }

    public String getEstado() {
        return estado; // Retorna o estado
    }

    public void setEstado(String estado) {
        this.estado = estado; // Define o estado
    }
}
