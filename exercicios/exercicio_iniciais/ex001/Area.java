import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        //recebendo a classe Scanner para ler dados.

        Double altura, base;
        System.out.println("Digite a altura do retangulo: ");
        altura = scanf.nextDouble();
        System.out.println("Digite a base do retngulo: ");
        base = scanf.nextDouble();
        //criando as varieveis e recebendo os valores do usuario

        System.out.printf("A area desse retangulo é: %.2f\n", base*altura);
        scanf.close();
        //Imprimindo o resultado e fechando o scanner
    }
}