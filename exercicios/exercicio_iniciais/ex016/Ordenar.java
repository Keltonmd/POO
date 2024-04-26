import java.util.*;

public class Ordenar {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double[] numeros = new Double[10];
        Double aux;
        //Iniciando as variaveis
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero:");
            numeros[i] = scanf.nextDouble();
            //Recebendo os dados
        
        }
        scanf.close();
        //Fechando o scanner
        
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
        //imprimindo os resultados e realizando os calculos
    }
}