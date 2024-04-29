public class Boleto {
    private String descricao; // Descrição do boleto
    private int codigo, diaDeVencimento; // Código do boleto e dia de vencimento
    private Double valor; // Valor do boleto
    private boolean status; // Status do pagamento do boleto (pago ou não)

    // Construtor da classe Boleto
    public Boleto(int codigo, String descricao, int diaDeVencimento, Double valor){
        this.codigo = codigo; // Inicializa o código do boleto
        this.descricao = descricao; // Inicializa a descrição do boleto
        this.diaDeVencimento = diaDeVencimento; // Inicializa o dia de vencimento do boleto
        this.valor = valor; // Inicializa o valor do boleto
        this.status = false; // Define o status do boleto como não pago
    }

    // Método para realizar o pagamento do boleto
    public boolean pagar(int dia, Double desconto, Double valorPago){
        // Verifica se o boleto já foi pago
        if(status){
            System.out.println("Pagamento não realizado!\n"+"Esse boleto já foi pago!");
            return status;
        }

        Double total = this.valor; // Inicializa o total a ser pago com o valor do boleto

        // Verifica se o pagamento está sendo feito antes ou depois do vencimento
        if(dia <= diaDeVencimento){
            total -= desconto; // Aplica o desconto se o pagamento for antes do vencimento
        }
        else{
            total += (total * 0.1) / 100; // Aplica a multa de 0.1% ao valor do boleto se o pagamento for após o vencimento
        }

        // Verifica se o valor pago é suficiente para pagar o boleto
        if(valorPago >= total){
            System.out.println("Pagamento Realizado com Sucesso!\n"+"Valor do boleto: R$"+total+"\nValor Pago: R$"+valorPago+"\nTroco: R$"+(valorPago - total));
            status = true; // Define o status do boleto como pago
        }
        else{
            System.out.println("Pagamento não realizado!\n"+"Valor insuficiente para o pagamento do boleto!");
        }
        return status; // Retorna o status do pagamento do boleto
    }

    // Método para exibir informações sobre o boleto
    public String exibir(){
        return "Codigo do Boleto: "+codigo+"\nDescrição do boleto: "+descricao+"\nDia de Vencimento: "+diaDeVencimento+"\nValor do Boleto: R$"+valor+"\nStatus do Boleto: "+(status? "Pago\n":"Não Pago\n");
    }

    // Métodos getter e setter para acessar e modificar a descrição do boleto
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

    // Métodos getter e setter para acessar e modificar o código do boleto
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    // Métodos getter e setter para acessar e modificar o dia de vencimento do boleto
    public void setDiaDeVencimento(int diaDeVencimento){
        this.diaDeVencimento = diaDeVencimento;
    }
    public int getDiaDeVencimento(){
        return diaDeVencimento;
    }

    // Métodos getter e setter para acessar e modificar o valor do boleto
    public void setValor(Double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return valor;
    }
}
