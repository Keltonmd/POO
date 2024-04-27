import java.util.*;

public class Tabuada2 {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
         //Instanciando o objeto scanner

        int valor;
        //Iniciando as variaveis
        
        do{
            System.out.println("Digite um numero inteiro de 1 a 10(Incluso):");
            valor = scanf.nextInt();
            if(valor > 0 && valor <= 10)
                break;
        }while(true);
        scanf.close();
        //recebendo os dados e fechando o scanner
        
        System.out.printf("\nTabuada\n");
        
        for(int i = 1; i <= 10; i++)
            System.out.printf("%d * %d = %d\n", valor, i, valor * i);
    }
    //imprimindo os resultados e realizando os calculos
}