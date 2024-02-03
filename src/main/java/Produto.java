public class Produto {
        // Atributos
        private String nome;
        private String descricao;
        private double precoUnitario;
        private int quantidade;

        // Construtor com obrigatoriedade do nome
        public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
            // Verifica se o nome é nulo ou vazio
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("O nome do produto é obrigatório.");
            }

            this.nome = nome;
            this.descricao = descricao;
            this.precoUnitario = precoUnitario;
            this.quantidade = quantidade;
        }

        // Métodos Getters
        public String getNome() {
            return nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        public int getQuantidade() {
            return quantidade;
        }

        // Método para imprimir dados do produto no console
        public void imprimirDados() {
         System.out.println(">> Dados do produto");
         System.out.println(":: Nome: " + getNome());
         System.out.println(":: Descrição: " + getDescricao());
         System.out.println(":: Preço Unitário: R$" + getPrecoUnitario());
         System.out.println(":: Quantidade em estoque: " + getQuantidade());
        }
}

