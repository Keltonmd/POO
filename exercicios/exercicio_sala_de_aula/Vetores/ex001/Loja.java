import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Interfaces terminal_face = new Interfaces();
        Estoque estoque = new Estoque();
        int opc;
        Produto produto;

        do {
            opc = terminal_face.interface_terminal();
            switch (opc) {
                case 1:
                    produto = terminal_face.cadastro();
                    estoque.adicionarProduto(produto);
                    break;
                case 2:
                  //  estoque.excluiProduto();
                    break;
                case 3:
                   // estoque.buscaProduto();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (true);
    }
}