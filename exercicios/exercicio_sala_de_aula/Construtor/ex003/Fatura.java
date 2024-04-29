public class Fatura {
    String descricao; // Descrição da fatura
    int numero, quantidade; // Número da fatura e quantidade de itens
    double preco; // Preço por unidade

    // Método para calcular o valor total da fatura
    public double getValorDaFatura(){
        return preco * quantidade; // Retorna o preço por unidade multiplicado pela quantidade
    }
    
    // Construtor da classe Fatura que recebe a descrição, número, quantidade e preço como parâmetros
    public Fatura(String descricao, int numero, int quantidade, double preco){
        this.descricao = descricao; // Inicializa a descrição da fatura
        this.numero = numero; // Inicializa o número da fatura

        // Verifica se a quantidade é maior que 0 e a atribui, caso contrário, define como 0
        if(quantidade > 0)
            this.quantidade = quantidade;
        else
            this.quantidade = 0;
        
        // Verifica se o preço é maior que 0 e o atribui, caso contrário, define como 0.0
        if(preco > 0)
            this.preco = preco;
        else
            this.preco = 0.0;
    }
}
