public class Paciente {
    String nome, sexo; // Declaração das variáveis de instância para o nome e sexo do paciente
    double peso, altura; // Declaração das variáveis de instância para o peso e altura do paciente

    // Método para calcular o Índice de Massa Corporal (IMC) do paciente
    public double calcularIMC(){
        return this.peso / (this.altura * this.altura); // Retorna o cálculo do IMC
    }
}
