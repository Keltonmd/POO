import java.util.*;

public class Maca {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        int quantidade;
        //Iniciando as variaveis
        
        System.out.println("Digite a quantidade de maças compradadas");
        quantidade = scanf.nextInt();

        scanf.close();
        //recebendo os dados e fechando o scanner
        
        if(quantidade >= 12)
            System.out.println("O valor a ser pago é R$: " +quantidade*1);
        else
            System.out.println("O valor a ser pago é R$: " +quantidade*1.3);
        //imprimindo os resultados
    }
}