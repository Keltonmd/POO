import java.util.*;

public class Notas {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        int[] nota = new int[20];
        int quantidade = 0;
        Double media = 0.0;
        //Iniciando as variaveis
        
        for(int i = 0; i < 20; i++){
            System.out.printf("A nota do %d° aluno:", i + 1);
            nota[i] = scanf.nextInt();
            //recebendo os dados 

            media += nota[i];
            //Somando as notas
            System.out.printf("\n");
        
        }

        scanf.close();
        //Fechando o scanner

        media /= 20;
        //calculando a media
        
        for(int i = 0; i < 20; i++){
            if(nota[i] > media)
                quantidade++;
        }
        //Descubrindo quantos alunos acima da media
        
        System.out.printf("A media da turma foi: %.2f\nA quantidade de alunos acima da media é: %d\n", media, quantidade);
        //imprimindo os resultados
    }
}