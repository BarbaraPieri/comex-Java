public class Eletronico extends Produto{
    // Atributos adicionais para Eletronico
    private int voltagem;
    private int potencia;

    // Construtor
    public Eletronico(String nome, String descricao, double precoUnitario, int quantidade, int voltagem, int potencia) {
        super(nome, descricao, precoUnitario, quantidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }

    // Métodos Getters específicos para Eletrônico
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para imprimir dados do produto eletronico no console
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço Unitário: " + getPrecoUnitario());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println(":: Voltagem: " + getVoltagem() + "V");
        System.out.println(":: Potência: " + getPotencia() + "W");
    }
}
