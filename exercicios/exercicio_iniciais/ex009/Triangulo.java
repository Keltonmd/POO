import java.util.*;

public class Triangulo {
    public static void main (String[] args){
        Scanner scanf = new Scanner(System.in);
        //Instanciando o objeto scanner

        Double a, b, c;
        //Iniciando as variaveis
        
        System.out.println("Digite o primeiro valor");
        a = scanf.nextDouble();
        
        System.out.println("Digite o segundo valor");
        b = scanf.nextDouble();
        
        System.out.println("Digite o terceiro valor");
        c = scanf.nextDouble();
        
        scanf.close();
        //recebendo os dados e fechando o scanner

        if(a < b + c && b < a + c && c < a + b)
            System.out.println("Essas medidas formam um triangulo!");
        else
            System.out.println("Essas medidas não formam um triangulo!");
        //imprimindo os resultados
    }
}
