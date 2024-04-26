import java.util.*;

public class Valor {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double valor;
        //Iniciando as variaveis

        System.out.println("Digite um valor:");
        valor = scanf.nextDouble();

        scanf.close();
        //recebendo os dados e fechando o scanner

        if(valor > 10)
            System.out.println("O valor digitado é maior que 10");
        else
            System.out.println("O valor digitado não é maior que 10");
        //imprimindo os resultados
    }
}