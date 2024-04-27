import java.util.Scanner;

public class Vet {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        // Instanciando o objeto scanner para entrada de dados

        Double[] vet = new Double[10];

        // Preenchendo o vetor com valores inseridos pelo usuário
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero:");
            vet[i] = scanf.nextDouble();
            // Recebendo os dados
        }
        scanf.close();
        // Fechando o scanner após a entrada dos dados

        // Vetor para armazenar as posições dos números repetidos
        int[] rep = new int[10];
        int cont = 0, pos = 0;
        boolean repetido = false;

        // Vetor para armazenar os números repetidos já encontrados
        Double[] encontrados = new Double[5];
        for (int i = 0; i < 5; i++) {
            encontrados[i] = -1.0;
            // Inicializando o vetor com -1.0 para verificar repetições
        }

        // Percorrendo o vetor para verificar números repetidos
        for (int i = 0; i < 10; i++){
            cont = 0;
            for(int j = 0; j < 10; j++){
                if (vet[i] - vet[j] == 0 && i != j) {
                    // Verificando se o número na posição i é igual ao número na posição j e se as posições são diferentes
                    rep[cont] = j;
                    cont++;
                }
            }

            if (cont != 0) {
                // Se a contagem for diferente de zero, significa que o número é repetido
                for(int t = 0; t < 5; t++){
                    if (vet[i] - encontrados[t] == 0) {
                        // Verificando se o número repetido já foi encontrado anteriormente
                        repetido = true;
                        break;
                    } else {
                        repetido = false;
                    }
                }

                if (repetido) {
                    // Se o número já foi encontrado, encerra a verificação
                    break;
                }

                // Imprimindo o número repetido e suas posições
                System.out.print("Numero repetido: "+vet[i]+"\nposições: ["+i+"]");
                for(int l = 0; l < cont; l++)
                    System.out.print("["+rep[l]+"]");
                System.out.println();

                // Adicionando o número repetido ao vetor de números encontrados
                encontrados[pos] = vet[i];
                pos++;
            }
        }
    }
}

