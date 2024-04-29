import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada do usuário
        Calculadora calculo = new Calculadora(); // Cria um objeto Calculadora chamado "calculo"

        int escolha;
        Double x, y;

        // Loop infinito para exibir o menu e processar a escolha do usuário
        while (true) {
            // Exibe o menu de opções para o usuário
            System.out.println("Qual operação deseja realizar:\n1 - [+] Adição\n2 - [-] Subtração\n3 - [*] Multiplicação\n4 - [/] Divisão\n5 - [0] Sair");
            escolha = scanf.nextInt(); // Lê a escolha do usuário

            switch (escolha) {
                case 1: 
                    // Caso 1: Realiza a adição
                    System.out.print("Digite um valor: ");
                    x = scanf.nextDouble(); // Lê o primeiro número
                    System.out.print("Digite um valor: ");
                    y = scanf.nextDouble(); // Lê o segundo número
                    System.out.println(x + " + " + y + " = " + calculo.soma(x, y)+"\n"); // Exibe o resultado da adição
                    break;
                case 2: 
                    // Caso 2: Realiza a subtração
                    System.out.print("Digite um valor: ");
                    x = scanf.nextDouble(); // Lê o primeiro número
                    System.out.print("Digite um valor: ");
                    y = scanf.nextDouble(); // Lê o segundo número
                    System.out.println(x + " - " + y + " = " + calculo.subtracao(x, y)+"\n"); // Exibe o resultado da subtração
                    break;
                case 3: 
                    // Caso 3: Realiza a multiplicação
                    System.out.print("Digite um valor: ");
                    x = scanf.nextDouble(); // Lê o primeiro número
                    System.out.print("Digite um valor: ");
                    y = scanf.nextDouble(); // Lê o segundo número
                    System.out.println(x + " * " + y + " = " + calculo.multiplicacao(x, y)+"\n"); // Exibe o resultado da multiplicação
                    break;
                case 4: 
                    // Caso 4: Realiza a divisão
                    System.out.print("Digite um valor: ");
                    x = scanf.nextDouble(); // Lê o primeiro número
                    do {
                        System.out.print("Digite um valor diferente de zero: ");
                        y = scanf.nextDouble(); // Lê o segundo número
                    } while (y == 0); // Garante que o divisor seja diferente de zero
                    System.out.println(x + " / " + y + " = " + calculo.divisao(x, y)+"\n"); // Exibe o resultado da divisão
                    break;
                case 0: 
                    // Caso 0: Encerra o programa
                    scanf.close(); // Fecha o Scanner
                    return;
            }
        }
    }
}
