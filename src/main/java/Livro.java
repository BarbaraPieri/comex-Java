public class Livro extends Produto{
    // Atributos adicionais para Livro
    private String isbn;
    private int totalPaginas;

    // Construtor
    public Livro(String nome, String descricao, double precoUnitario, int quantidade, String isbn, int totalPaginas) {
        super(nome, descricao, precoUnitario, quantidade);
        this.isbn = isbn;
        this.totalPaginas = totalPaginas;
    }

    // Métodos Getters específicos para Livro
    public String getIsbn() {
        return isbn;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    // Método para imprimir dados do livro no console
    @Override
    public void imprimirDados() {
        super.imprimirDados(); // Chama o método da classe pai
        System.out.println(":: ISBN: " + getIsbn());
        System.out.println(":: Total de Páginas: " + getTotalPaginas());
    }
<<<<<<< Updated upstream
}
=======

}
>>>>>>> Stashed changes
