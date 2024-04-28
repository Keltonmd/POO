public class Retangulo {
    // Declaração das variáveis de instância para o comprimento e largura do retângulo
    Double comprimento, largura;

    // Construtor padrão da classe Retangulo
    public Retangulo() {
        // Inicializa o comprimento e a largura do retângulo com valores padrão de 1.0
        this.comprimento = 1.0;
        this.largura = 1.0;
    }

    // Método para calcular o perímetro do retângulo
    public Double perimetro(){
        // Retorna o perímetro, que é calculado como 2 vezes a soma do comprimento e da largura
        return 2 * (comprimento + largura);
    }

    // Método para calcular a área do retângulo
    public Double area(){
        // Retorna a área, que é calculada como o produto do comprimento e da largura
        return comprimento * largura;
    }
}
