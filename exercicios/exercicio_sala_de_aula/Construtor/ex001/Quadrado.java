public class Quadrado {
    double lado; // Variável de instância para armazenar o tamanho do lado do quadrado

    // Construtor da classe Quadrado que recebe o tamanho do lado como parâmetro
    public Quadrado(double x){
        this.lado = x; // Inicializa o tamanho do lado com o valor fornecido
    }

    // Método para calcular a área do quadrado
    public double calcularArea(){
        return lado * lado; // Retorna a área do quadrado (lado * lado)
    }

    // Método para calcular o perímetro do quadrado
    public double calcularPerimetro(){
        return 4 * lado; // Retorna o perímetro do quadrado (4 * lado)
    }
}
