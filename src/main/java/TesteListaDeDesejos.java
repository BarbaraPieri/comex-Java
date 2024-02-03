public class TesteListaDeDesejos {
    public static void main(String[] args) {
        // Criando alguns produtos
        Produto produto1 = new Produto("Lapiseira", "Lapiseira 0,7 Pentel", 25.99, 1);
        Produto produto2 = new Produto("Marca Texto", "Marca Texto Stabilo Azul Pastel", 9.99, 2);
        Produto produto3 = new Produto("Fine Line", "Caneta Fine Line Unipin  0,1", 10.0, 3);

        // Instanciando a ListaDeDesejos
        ListaDeDesejos listaDeDesejos = new ListaDeDesejos();

        // Adicionando produtos à lista de desejos
        listaDeDesejos.adicionaProduto(produto1);
        listaDeDesejos.adicionaProduto(produto2);
        listaDeDesejos.adicionaProduto(produto3);

        // Exibindo a lista de desejos
        listaDeDesejos.imprimeProdutos();
    }
}
