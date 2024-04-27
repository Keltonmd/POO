import java.util.*;

public class Insercao {

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double[] numeros = new Double[11];
        Double aux;
        //Iniciando as variaveis
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero:");
            numeros[i] = scanf.nextDouble();
            //Recebendo os dados
        
        }
        
        int maior, ult = 9;
        //Iniciando as variaveis
        
        for(int i = 0; i < 10; i++){
            maior = 0;
            for(int j = 0; j < ult + 1; j++){
                if(numeros[maior] < numeros[j]){
                    maior = j;
                }
            }
            aux = numeros[ult];
            numeros[ult] = numeros[maior];
            numeros[maior] = aux;
            ult--;
        }
        //Realizando a ordenção pelo metodo selection sort
        
        for(int i = 0; i < 10; i++){
            System.out.printf("[%.1f] ", numeros[i]);
        }
        System.out.printf("\n");
        //imprimindo os resultados

        //Inserindo mais um numero
        System.out.println("Digite um numero:");
        numeros[10] = scanf.nextDouble();
        //Recebendo os dados

        scanf.close();
        //Fechando o scanner

        Double num = numeros[10];
        
        for (int i = 0; i < 11; i++){
            if (num < numeros[i]) {
                aux = numeros[i];
                numeros[i] = num;
                num = aux;
            }
        }
        //Conferindo a inserção

        for(int i = 0; i < 11; i++){
            System.out.printf("[%.1f] ", numeros[i]);
        }
        System.out.printf("\n");
        //imprimindo os resultados
    }
}