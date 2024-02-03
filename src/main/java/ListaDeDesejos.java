import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<Produto> produtos;

    public ListaDeDesejos() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar um produto à lista de desejos
    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para imprimir os produtos da lista de desejos
    public void imprimeProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Lista de desejos vazia.");
        } else {
            System.out.println("Produtos na Lista de Desejos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() +
                        ", Descrição: " + produto.getDescricao() +
                        ", Preço Unitário: R$" + produto.getPrecoUnitario() +
                        ", Quantidade: " + produto.getQuantidade());
            }
        }
    }
}
