import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário
        
        // Solicita ao usuário o valor do lado do quadrado
        System.out.println("Informe o valor do lado do quadrado: ");
        double lado = scanf.nextDouble(); // Lê o valor do lado do quadrado

        // Cria um objeto da classe Quadrado com o valor do lado fornecido
        Quadrado quad = new Quadrado(lado);

        // Calcula e exibe a área e o perímetro do quadrado
        System.out.printf("\n[Área do quadrado] = %.2f\n[Perímetro do quadrado] = %.2f\n\n", quad.calcularArea(), quad.calcularPerimetro());

        scanf.close(); // Fecha o Scanner após a entrada de dados
    }
}
