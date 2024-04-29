import java.util.*;

public class Clinica {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada do usuário
        Paciente[] pac1 = new Paciente[2]; // Cria um array de objetos Paciente com capacidade para dois pacientes

        pac1[0] = new Paciente(); // Cria o primeiro objeto Paciente
        pac1[1] = new Paciente(); // Cria o segundo objeto Paciente

        String[] pac = {"primeiro", "segundo"}; // Array para armazenar os nomes dos pacientes

        // Loop para iterar sobre os pacientes
        for(int i = 0; i < 2; i++){
            // Solicita e lê as informações do paciente
            System.out.println("Digite o nome do "+pac[i]+" paciente: ");
            pac1[i].nome = scanf.nextLine();
            System.out.println("Digite o sexo do "+pac[i]+" paciente: ");
            pac1[i].sexo = scanf.nextLine();
            System.out.println("Digite o peso do "+pac[i]+" paciente: ");
            pac1[i].peso = scanf.nextDouble();
            System.out.println("Digite a altura do "+pac[i]+" paciente: ");
            pac1[i].altura = scanf.nextDouble();
            scanf.nextLine(); // Limpa o buffer do Scanner
        }
        scanf.close(); // Fecha o Scanner após a entrada de dados

        // Loop para exibir as informações dos pacientes
        for(int i = 0; i < 2; i++){
            // Exibe o nome, sexo e IMC de cada paciente
            System.out.printf("\n[%s paciente]\nnome: %s\nsexo: %s\nIMC: %.2f\n\n", pac[i], pac1[i].nome, pac1[i].sexo, pac1[i].calcularIMC());
        }
    }   
}
