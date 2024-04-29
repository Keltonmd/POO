import java.util.*;

public class Banco {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(); // Criação de um objeto ContaBancaria chamado "conta"

        conta.numero = 256; // Define o número da conta como 256
        conta.saldo = 0.0; // Define o saldo inicial da conta como 0.0

        // Exibe o número da conta e o saldo atual
        System.out.println("Conta: " + conta.numero + "\nSaldo: " + conta.verSaldo() + "R$\n");

        conta.depositar(250.0); // Realiza um depósito de 250.0 na conta

        // Exibe o número da conta e o novo saldo após o depósito
        System.out.println("Conta: " + conta.numero + "\nSaldo: " + conta.verSaldo() + "R$\n");

        conta.sacar(67.39); // Realiza um saque de 67.39 da conta

        // Exibe o número da conta e o novo saldo após o saque
        System.out.println("Conta: " + conta.numero + "\nSaldo: " + conta.verSaldo() + "R$");

        scanf.close(); // Fecha o Scanner
    }
}
