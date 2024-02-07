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

    public int getPotencia() {
        return potencia;
    }

    // Método para imprimir dados do produto eletronico no console
    @Override
    public void imprimirDados() {
        super.imprimirDados(); // Chama o método da classe pai
        System.out.println(":: Voltagem: " + getVoltagem() + "V");
        System.out.println(":: Potência: " + getPotencia() + "W");
    }
}
