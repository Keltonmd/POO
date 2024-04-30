public class Emprestimo {
    private String nomeCliente;
    private Double renda;
    
    // Construtor padrão
    public Emprestimo(){
    }

    // Construtor com parâmetros
    public Emprestimo(String nomeCliente, Double renda){
        this.nomeCliente = nomeCliente;
        this.renda = renda;
    }

    // Método para calcular o empréstimo com base na renda (fator 4)
    public Double calculaEmprestimo(){
        return this.renda * 4;
    }

    // Método para calcular o empréstimo com base na renda e em um fator específico
    public Double calculaEmprestimo(int fator){
        if (fator >= 2 && fator <= 10) { // Verifica se o fator está dentro do intervalo válido
            return this.renda * fator; // Calcula o empréstimo
        }
        return 0.0; // Retorna 0 se o fator não estiver no intervalo válido
    }

    // Método para calcular o empréstimo com base na renda e em uma taxa de juros específica
    public Double calculaEmprestimo(Double taxa){
        if (taxa >= 1 && taxa <= 15) { // Verifica se a taxa de juros está dentro do intervalo válido
            Double retorno = renda * 5; // Calcula o empréstimo com base na renda multiplicada por 5
            return retorno - (retorno * (taxa/100)); // Aplica a taxa de juros e retorna o valor final do empréstimo
        }
        return 0.0; // Retorna 0 se a taxa de juros não estiver no intervalo válido
    }

    // Métodos getter e setter para nomeCliente
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    // Métodos getter e setter para renda
    public Double getRenda() {
        return renda;
    }
    public void setRenda(Double renda) {
        this.renda = renda;
    }
}