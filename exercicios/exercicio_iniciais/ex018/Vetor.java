import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double[] vetor = new Double[30];
        Double num;

        for(int i = 0; i < 30; i++){
            System.out.println("Digite um numero:");
            vetor[i] = scanf.nextDouble();
            //Recebendo os dados
        }

        System.out.println("Digite um numero para comparar com os outros do vetor:");
        num = scanf.nextDouble();
        //Recebendo os dados

        scanf.close();
        //Fechando o scanner

        int quant = 0;

        for(int i = 0; i < 30; i++){
            if (num - vetor[i] == 0) {
            //Estou calculando pela diferença, pois com a igualdade da um pequeno erro, pois, segundo o que pesquisei mesmo que os números pareçam iguais quando impressos, podem haver pequenas diferenças devido à representação interna. isso com o double ou ponto flutuantes.
                quant++;
            }
        }

        System.out.printf("O numero %.2f aperece %d vezes no vetor.", num, quant);
        //imprimindo os resultados
    }
    




}
