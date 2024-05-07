public class ContaBancaria {
    // Declaração dos atributos da classe
    private Pessoa cliente; // Representa o cliente associado à conta bancária
    private int numeroDaConta; // Número da conta bancária
    private Double saldo; // Saldo disponível na conta bancária
    
    // Construtor da classe ContaBancaria
    public ContaBancaria(Pessoa cliente, int numeroDaConta) {
        this.cliente = cliente; // Inicializa o cliente da conta bancária com o valor passado como argumento
        this.numeroDaConta = numeroDaConta; // Inicializa o número da conta bancária com o valor passado como argumento
        this.saldo = 0.0; // Inicializa o saldo da conta bancária com o valor passado como argumento
    }

    // Método para realizar um saque na conta bancária
    public boolean sacar(float saque){
        // Verifica se o valor do saque é positivo e se é menor ou igual ao saldo disponível na conta
        if (saque >= 0 && saque <= this.saldo) {
            this.saldo -= saque;
            return true; // Retorna true se o saque for bem-sucedido
        }
        return false; // Retorna false se o saque não puder ser realizado
    }

    // Método para realizar um depósito na conta bancária
    public boolean depositar(float deposito){
        // Verifica se o valor do depósito é positivo
        if (deposito >= 0) {
            this.saldo += deposito;
            return true; // Retorna true se o depósito for bem-sucedido
        }
        return false; // Retorna false se o depósito não puder ser realizado
    }

    // Métodos getters e setters para os atributos da classe
    public Pessoa getCliente() {
        return cliente; // Retorna o cliente associado à conta bancária
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente; // Define o cliente associado à conta bancária
    }

    public int getNumeroDaConta() {
        return numeroDaConta; // Retorna o número da conta bancária
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta; // Define o número da conta bancária
    }

    public Double getSaldo() {
        return saldo; // Retorna o saldo disponível na conta bancária
    }
}