import java.util.Scanner;

public class CustoFinal {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double custoFabrica;
        String carro;
        //Iniciando as variaveis

        System.out.println("Digite o modelo do carro:");
        carro = scanf.nextLine();

        System.out.println("Digite o custo de fabrica do carro");
        custoFabrica = scanf.nextDouble();
        
        scanf.close();
        //recebendo os dados e fechando o scanner

        Double custoFinal;

        custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        //realizando os calculos

        System.out.printf("\nDados\nModelo: %s\nCusto Final: %.2f\n", carro, custoFinal);
        //imprimindo os resultados
    }
}
