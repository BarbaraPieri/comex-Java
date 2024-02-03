public class GerenciadorProdutos {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Produto
        Produto produto1 = new Produto("Lapiseira", "Lapiseira 0,7 Pentel", 25.99, 20);

        //Chamando o método para imprimir dados do produto
        produto1.imprimirDados();
    }
}
