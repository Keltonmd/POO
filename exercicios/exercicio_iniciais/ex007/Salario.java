import java.util.*;

public class Salario {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double salario, valorVendas;
        //Iniciando as variaveis
        
        System.out.println("Digite o salario fixo desse funcionario:");
        salario = scanf.nextDouble();
        
        System.out.println("Digite o valor das vendas efutadas pelo funcionario:");
        valorVendas = scanf.nextDouble();
        
        scanf.close();
        //recebendo os dados e fechando o scanner
        
        if(valorVendas > 1500)
            System.out.printf("O salario desse funcionario é: R$%.2f\n", salario + (1500 * ((double)3/100)) + ((valorVendas - 1500) * ((double)5/100)));
        else
            System.out.printf("O salario desse funcionario é: R$%.2f\n", salario + (1500*((double)3/100)));
        //imprimindo os resultados
    }
}
