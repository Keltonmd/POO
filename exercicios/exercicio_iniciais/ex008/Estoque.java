import java.util.*;

public class Estoque {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        int quantidadeAtual, quantidadeMax, quantidadeMin;
        //Iniciando as variaveis
        
        System.out.println("Digite a quantidade atual do produto no estoque:");
        quantidadeAtual = scanf.nextInt();
        
        System.out.println("Digite a quantidade máxima permitida desse produto em estoque:");
        quantidadeMax = scanf.nextInt();
        
        System.out.println("Digite a quantidade minima permitida desse produto em estoque:");
        quantidadeMin = scanf.nextInt();
        
        scanf.close();
        //recebendo os dados e fechando o scanner
        
        if(quantidadeAtual >= ((quantidadeMax + quantidadeMin)/ 2))
            System.out.println("Não efetuar compra!");
        else
            System.out.println("Efetuar compra!");
        //imprimindo os resultados
    }
}
