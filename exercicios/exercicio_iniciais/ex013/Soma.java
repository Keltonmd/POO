import java.util.*;

public class Soma {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        int valor1, valor2, aux, soma = 0;
        //Iniciando as variaveis
        
        System.out.println("Digite um valor inteiro:");
        valor1 = scanf.nextInt();
        
        System.out.println("Digite um valor inteiro:");
        valor2 = scanf.nextInt();

        scanf.close();
        //recebendo os dados e fechando o scanner
        
        if(valor1 > valor2){
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        //Ordenando os valores
        
        for(int i = valor1; i <= valor2; i++)
            soma += i;
        //realizando os calculos
        
        System.out.printf("A soma dos valores inteiro existentes entre %d e %d (Incluindo os proprios valores) é igual a %d.\n", valor1, valor2, soma);
        //imprimindo os resultados
    }
}