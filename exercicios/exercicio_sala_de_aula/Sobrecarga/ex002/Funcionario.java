public class Funcionario {
    private String nome;
    private Double salarioBase;
    private int tempoDeServico;

    // Construtor para inicializar os atributos
    public Funcionario(String nome, Double salarioBase, int tempoDeServico) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tempoDeServico = tempoDeServico;
    }
    
    // Método para calcular o salário considerando apenas o tempo de serviço
    public Double mostrarSalario() {
        // Se o tempo de serviço for menor ou igual a 10 anos, adiciona 12% ao salário base
        if (this.tempoDeServico <= 10) {
            return this.salarioBase + (this.salarioBase * 0.12);
        } 
        // Se o tempo de serviço for maior que 10 anos, adiciona 17% ao salário base
        else if (this.tempoDeServico > 10) {
            return this.salarioBase + (this.salarioBase * 0.17);
        }
        // Retorna 0.0 se o tempo de serviço for negativo ou não se encaixar nas condições anteriores
        return 0.0;
    }

    // Método para calcular o salário considerando o total de vendas
    public Double mostrarSalario(Double totalDeVendas) {
        // Se o tempo de serviço for menor ou igual a 10 anos
        if (this.tempoDeServico <= 10) {
            // Adiciona 5% ao salário base e 1.5% do total de vendas
            return this.salarioBase + (this.salarioBase * 0.05) + (totalDeVendas * 0.015);
        } 
        // Se o tempo de serviço for maior que 10 anos
        else if (this.tempoDeServico > 10) {
            // Adiciona 10% ao salário base e 2% do total de vendas
            return this.salarioBase + (this.salarioBase * 0.10) + (totalDeVendas * 0.02);
        }
        // Retorna 0.0 se o tempo de serviço for negativo ou não se encaixar nas condições anteriores
        return 0.0;
    }

    // Métodos getters e setters para os atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public int getTempoDeServico() {
        return tempoDeServico;
    }
    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
}   