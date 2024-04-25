import java.util.*;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        int eleitores, votosBrancos, votosNulos, votosValidos;
        //Iniciando as variaveis

        System.out.println("Digite o numero total de eleitores:");
        eleitores = scanf.nextInt();

        System.out.println("Digite a quantidade de votos em branco:");
        votosBrancos = scanf.nextInt();

        System.out.println("Digite a quantidade de votos nulos:");
        votosNulos = scanf.nextInt();

        System.out.println("Digite a quantidade de votos validos;");
        votosValidos = scanf.nextInt();

        scanf.close();
        //recebendo os dados e fechando o scanner

        Double porcValidos, porcNulos, porcBrancos;

        porcValidos = (double) ((votosValidos * 100) / eleitores);
        porcNulos = (double) ((votosNulos * 100) / eleitores);
        porcBrancos = (double) ((votosBrancos * 100) / eleitores);
        //realizando os calculos dos percentuais

        System.out.printf("\nDados\nEleitores: %d\nVotos Validos: %d\nVotos Nulos: %d\nVotos Brancos: %d\n\nPercentuais\nPercentual de Votos Validos: %.2f%%\nPercentual de Votos Nulos: %.2f%%\nPercentual de Votos Brancos: %.2f%%\n", eleitores, votosValidos, votosNulos, votosBrancos, porcValidos, porcNulos, porcBrancos);
        //imprimindo os resultados
    }
}
