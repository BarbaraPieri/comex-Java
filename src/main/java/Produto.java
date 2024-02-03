public class Produto {
        // Atributos
        private String nome;
        private String descricao;
        private double precoUnitario;
        private int quantidade;

        // Construtor
        public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
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
    }

