public class Funcionario {
    String nome; // Variável de instância para armazenar o nome do funcionário
    double horasTrabalhadas, valorDaHora; // Variáveis de instância para armazenar as horas trabalhadas e o valor da hora do funcionário

    // Método para calcular o salário final do funcionário
    public double salariofinal(){
        // Calcula o salário final subtraindo 11% (impostos) do valor total das horas trabalhadas
        return (horasTrabalhadas * valorDaHora) - ((horasTrabalhadas * valorDaHora) * (11/100));
    }
}
