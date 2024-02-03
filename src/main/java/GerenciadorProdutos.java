public class GerenciadorProdutos {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Produto
        Produto produto1 = new Produto("Lapiseira", "Lapiseira 0,7 Pentel", 25.99, 20);

        // Acessando e exibindo as propriedades no console
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Preço Unitário: R$" + produto1.getPrecoUnitario());
        System.out.println("Quantidade em estoque: " + produto1.getQuantidade());
    }
}
