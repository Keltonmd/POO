public class Carro {
    private double combustivel; // Quantidade de combustível no carro
    private double quilometragem; // Quilometragem percorrida pelo carro

    // Construtor da classe Carro que recebe a quantidade inicial de combustível como parâmetro
    public Carro(double combustivel){
        this.combustivel = combustivel; // Inicializa a quantidade de combustível com o valor fornecido
    }

    // Método para percorrer uma determinada distância
    public void percorrerDistancia(int distancia){
        // Verifica se há combustível suficiente para percorrer a distância
        if(combustivel >= distancia/12){
            this.quilometragem += distancia; // Atualiza a quilometragem percorrida
            this.combustivel -= distancia/12; // Reduz o combustível consumido com base na distância percorrida
        } else {
            System.out.println("Quantidade de combustível insuficiente!"); // Mensagem de erro se não houver combustível suficiente
        }
    }

    // Método para abastecer o carro com uma determinada quantidade de litros de combustível
    public void abastecer(double litros){
        this.combustivel += litros; // Incrementa a quantidade de combustível no carro
    }

    // Método para calcular a autonomia do veículo (quantos quilômetros ele pode percorrer com o combustível atual)
    public double autonomia(){
        return combustivel * 12; // Retorna a quantidade de quilômetros que o carro pode percorrer com o combustível atual
    }

    // Métodos getter e setter para acessar e modificar a quantidade de combustível
    public double getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(double combustivel){
        this.combustivel = combustivel;
    }

    // Métodos getter e setter para acessar e modificar a quilometragem percorrida
    public double getQuilometragem(){
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
}
