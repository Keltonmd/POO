import java.util.*;

public class Produto {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner
        
        String nome;
        int quantidade;
        Double precoUni;
        //Iniciando as variaveis
        
        System.out.println("Digite a descrição do produto:");
        nome = scanf.nextLine();
        
        System.out.println("Digite a quantidade adquirida do produto:");
        quantidade = scanf.nextInt();
        
        System.out.println("Digite o preço unitario desse produto:");
        precoUni = scanf.nextDouble();

        scanf.close();
        //recebendo os dados e fechando o scanner
        
        if(quantidade <= 5){
            Double total = precoUni * quantidade, desconto = (double) (total * 0.02), totalAPagar = total - desconto;
            //Realizando os calculos

            System.out.printf("\n%s\nTotal = R$%.2f\nDesconto: R$%.2f\nTotal a pagar: R$%.2f\n", nome, total, desconto, totalAPagar);
            //imprimindo os resultados
        }
        if(quantidade > 5 && quantidade <= 10){
            Double total = precoUni * quantidade, desconto = (double) (total * 0.03), totalAPagar = total - desconto;
            //Realizando os calculos

            System.out.printf("\n%s\nTotal = R$%.2f\nDesconto: R$%.2f\nTotal a pagar: R$%.2f\n", nome, total, desconto, totalAPagar);
            //imprimindo os resultados
        }
        if(quantidade > 10){
            Double total = precoUni * quantidade, desconto = (double) (total * 0.05), totalAPagar = total - desconto;
            //Realizando os calculos

            System.out.printf("\n%s\nTotal = R$%.2f\nDesconto: R$%.2f\nTotal a pagar: R$%.2f\n", nome, total, desconto, totalAPagar);
            //imprimindo os resultados
        }
    }
}
