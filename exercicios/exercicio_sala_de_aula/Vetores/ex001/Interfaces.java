import java.util.Scanner;

public class Interfaces {

    public int interface_terminal(){
        int opc;
        Scanner scanf = new Scanner(System.in);
        while (true) {
            System.out.println("1) Cadastrar Produto");
            System.out.println("2) Remover Produto");
            System.out.println("3) Buscar Produto por Código");
            System.out.println("4) Buscar Produto por Descrição");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opc =scanf.nextInt();
                if (opc > 0 && opc <= 5) {
                    if (opc == 5) {
                        scanf.close();
                    }
                    System.out.println(opc);
                    return opc; 
                } else {
                    System.out.println("Digite uma opção valida!");
                    sleep(2);
                    limparTela();
                }
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida! Digite um número inteiro.");
                scanf.nextLine();
                sleep(2);
                limparTela();
            }
            
        }
    }

    public Produto cadastro() {
        Produto produto = null;
        Scanner scanf = new Scanner(System.in);

        // Loop para garantir que o cadastro seja válido
        while (true) {
            limparTela();
            System.out.println("===== CADASTRO DE PRODUTO =====");
            try {
                System.out.println("Digite a descrição do Produto: ");
                String descricao = scanf.nextLine();

                // Validando o código do produto
                int codigo = 0;
                while (true) {
                    try {
                        System.out.println("Digite o código do Produto:");
                        codigo = Integer.parseInt(scanf.nextLine());
                        if (codigo <= 0) {
                            System.out.println("Código deve ser um número positivo.");
                            sleep(2);
                            limparTela();
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Código inválido. Digite um número inteiro válido.");
                        sleep(2);
                        limparTela();
                    }
                }

                // Validando o preço do produto
                double preco = 0;
                while (true) {
                    try {
                        System.out.println("Digite o preço do Produto: ");
                        preco = Double.parseDouble(scanf.nextLine());
                        if (preco <= 0) {
                            System.out.println("Preço deve ser maior que 0.");
                            sleep(2);
                            limparTela();
                        } else {
                            break; // Sai do loop de preço válido
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Preço inválido. Digite um número válido.");
                        sleep(2);
                        limparTela();
                    }
                }

                // Validando a quantidade do produto
                int quantidade = 0;
                while (true) {
                    try {
                        System.out.println("Digite a quantidade do Produto: ");
                        quantidade = Integer.parseInt(scanf.nextLine());
                        if (quantidade <= 0) {
                            System.out.println("Quantidade deve ser maior que 0.");
                            sleep(2);
                            limparTela();
                        } else {
                            break; // Sai do loop de quantidade válida
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Quantidade inválida. Digite um número inteiro válido.");
                        sleep(2);
                        limparTela();
                    }
                }

                // Criando o objeto Produto com os dados
                produto = new Produto(codigo, descricao, preco, quantidade);

                System.out.println("Produto cadastrado com sucesso!");
                
                // Pausando por 2 segundos antes de continuar
                sleep(2);
                limparTela();
                
                break; // Sai do loop de cadastro

            } catch (Exception e) {
                System.out.println("Erro durante o cadastro. Tente novamente.");
                sleep(2); // Pausa por 2 segundos antes de tentar novamente
            }
        }
        return produto;
    }

    public void limparTela(){
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela.");
        }
    }

    public void sleep(int tempo) {
        tempo *= 1000;
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            // Erro
        }
    }

    // Fim
}
