import java.util.*;

public class Divisao {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double valor1, valor2;
        //Iniciando as variaveis
        
        System.out.println("Digite um valor:");
        valor1 = scanf.nextDouble();
        
        do{
            System.out.println("Digite outro valor diferente de zero:");
            valor2 = scanf.nextDouble();
            if(valor2 != 0)
                break;
        }while(true);
        
        scanf.close();
        //recebendo os dados e fechando o scanner

        Double resultado = valor1/valor2;
        //Realizando os calculos
        
        System.out.printf("\nDivisão\n%.2f/%.2f = %.2f\n", valor1, valor2, resultado);
        //imprimindo os resultados
    }
}