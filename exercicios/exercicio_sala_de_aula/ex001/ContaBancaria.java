public class ContaBancaria {
    int numero;
    Double saldo;

    // Método para realizar um saque
    public void sacar(Double saque){
        this.saldo -= saque;
    }
    
    // Método para realizar um depósito
    public void depositar(Double deposito){
        this.saldo += deposito;
    }

    // Método para verificar o saldo da conta
    public Double verSaldo(){
        return saldo; // Retorna o saldo atual da conta
    }
}
