import java.util.*;

public class SalarioFinal {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        String funcionario;
        int nCarros;
        Double valorTotal, salario, valorPorCarro;
        //Iniciando as variaveis

        System.out.println("Digite o nome do funcionario:");
        funcionario = scanf.nextLine();

        System.out.println("Digite a quantidades de carros vendidos:");
        nCarros = scanf.nextInt();
        
        System.out.println("Digite o valor total vendido pelo funcionario " +funcionario +":");
        valorTotal = scanf.nextDouble();
        
        System.out.println("Digite o valor recebido por carro vendido:");
        valorPorCarro = scanf.nextDouble();
        
        System.out.println("Digite o valor do salario fixo do funcionario " +funcionario +":");
        salario = scanf.nextDouble();

        scanf.close();
        //recebendo os dados e fechando o scanner

        Double salarioFinal;

        salarioFinal = salario + (valorPorCarro * nCarros) + (valorTotal * 0.05);
        //realizando os calculos

        System.out.printf("\nO salario do funcionario %s é de %.2f\n", funcionario, salarioFinal);
        //imprimindo os resultados
    }
}
