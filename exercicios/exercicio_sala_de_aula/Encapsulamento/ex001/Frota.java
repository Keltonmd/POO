import java.util.*;

public class Frota {

    // Método para exibir a interface de opções e obter a escolha do usuário
    static int interfac(){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a opção desejada\n[1] - Autonomia\n[2] - Abastecer\n[3] - Combustível\n[4] - Distância que deseja Percorrer\n[0] - Sair");
        int x = scanf.nextInt();
        scanf.nextLine(); // Limpa o buffer do Scanner
        if (x == 0)
            scanf.close(); // Fecha o Scanner se a escolha for 0
        return x; // Retorna a escolha do usuário
    }

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        // Solicita a quantidade de combustível inicial do veículo
        System.out.println("Digite a quantidade de combustível inicial do veículo:");
        double combustivel = scanf.nextDouble();

        // Cria um objeto da classe Carro com a quantidade inicial de combustível fornecida
        Carro car1 = new Carro(combustivel);

        int distancia; // Variável para armazenar a distância a ser percorrida

        // Loop para interagir com o usuário até que ele escolha sair
        do {
            // Exibe a interface de opções e obtém a escolha do usuário
            switch(interfac()){
                case 1: // Opção para exibir a autonomia do veículo
                    System.out.printf("A autonomia do veículo é: %.2f\n", car1.autonomia());
                    break;
                case 2: // Opção para abastecer o veículo
                    System.out.println("Digite a quantidade de combustível que foi abastecida:");
                    combustivel = scanf.nextDouble(); // Lê a quantidade de combustível do usuário
                    car1.abastecer(combustivel); // Chama o método para abastecer o veículo
                    break;
                case 3: // Opção para exibir a quantidade atual de combustível
                    System.out.println("A quantidade de combustível atual é: " + car1.getCombustivel());
                    break;
                case 4: // Opção para percorrer uma determinada distância
                    System.out.println("Digite a distância que você quer percorrer:");
                    distancia = scanf.nextInt(); // Lê a distância a ser percorrida do usuário
                    car1.percorrerDistancia(distancia); // Chama o método para percorrer a distância
                    break;
                case 0: // Opção para sair do programa
                    scanf.close(); // Fecha o Scanner
                    return; // Sai do método main
            }
        } while(true); // Loop infinito
    }
}
