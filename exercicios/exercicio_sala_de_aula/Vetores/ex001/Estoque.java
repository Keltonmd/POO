public class Estoque {
    private Produto[] produtos = new Produto[10];

    public void adicionarProduto(Produto produto) {
        for(int i = 0; i <= produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                break;
            }
        }
    }

    public void excluiProduto(Produto produto) {
        for(int i = 0; i <= produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].getCodigo() == produto.getCodigo()) {
                    produtos[i] = null;
                    break;                    
                }                
            }
        }
    }

    public Produto buscaProduto(int codigo) {
        for(int i = 0; i <= produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].getCodigo() == codigo) {
                    return produtos[i];                
                }                
            }
        }
        return null;
    }

    public Produto buscaProduto(String descricao) {
        for(int i = 0; i <= produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].getDescricao().equals(descricao)) {
                    return produtos[i];                
                }                
            }
        }
        return null;
    }

}