import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada do usuário

        Retangulo retangulo = new Retangulo(); // Cria um objeto Retangulo chamado "retangulo"

        int escolha;

        // Loop infinito para exibir o menu e processar a escolha do usuário
        while (true) {
            System.out.println("[1] - Perimetro\n[2] - Area\n[0] sair");
            escolha = scanf.nextInt(); // Lê a escolha do usuário

            switch(escolha){
                case 1: 
                    // Caso 1: Calcula e exibe o perímetro do retângulo
                    System.out.print("\nDigite a largura do retangulo: ");
                    retangulo.largura = scanf.nextDouble(); // Lê a largura do retângulo
                    System.out.print("Digite o comprimento do retangulo: ");
                    retangulo.comprimento = scanf.nextDouble(); // Lê o comprimento do retângulo
                    System.out.println("Perimetro: " + retangulo.perimetro() + "\n");
                    break;
                case 2: 
                    // Caso 2: Calcula e exibe a área do retângulo
                    System.out.print("\nDigite a largura do rentangulo: ");
                    retangulo.largura = scanf.nextDouble(); // Lê a largura do retângulo
                    System.out.print("Digite o comprimento do retangulo: ");
                    retangulo.comprimento = scanf.nextDouble(); // Lê o comprimento do retângulo
                    System.out.println("Area: " + retangulo.area() + "\n");
                    break;
                case 0: 
                    // Caso 0: Encerra o programa
                    scanf.close(); // Fecha o Scanner
                    return;
            }
        }
    }
}
