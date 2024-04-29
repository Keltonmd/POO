public class Calculadora {

    // Método para realizar a operação de soma
    public Double soma(Double x, Double y){
        x += y; // Soma o valor de y ao valor de x
        return x; // Retorna o resultado da soma
    }

    // Método para realizar a operação de subtração
    public Double subtracao(Double x, Double y){
        x -= y; // Subtrai o valor de y do valor de x
        return x; // Retorna o resultado da subtração
    }

    // Método para realizar a operação de multiplicação
    public Double multiplicacao(Double x, Double y){
        x *= y; // Multiplica o valor de x pelo valor de y
        return x; // Retorna o resultado da multiplicação
    }

    // Método para realizar a operação de divisão
    public Double divisao(Double x, Double y){
        x /= y; // Divide o valor de x pelo valor de y
        return x; // Retorna o resultado da divisão
    }
}
