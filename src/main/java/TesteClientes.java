public class TesteClientes {
    public static void main(String[] args) {
        // Criando um endereço
        Endereco enderecoCliente = new Endereco("Centro", "São Paulo", "Apto 123", "SP", "Rua A", 123);

        // Criando um cliente associado ao endereço
        Cliente cliente = new Cliente("Ana Paula", "123.456.789-01", "apaula@gmail.com", "Medica", "123-456789", enderecoCliente);

        // Exibindo informações do cliente e endereço
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Profissão: " + cliente.getProfissao());
        System.out.println("Telefone: " + cliente.getTelefone());

        // Exibindo informações do endereço do cliente
        System.out.println("\nEndereço:");
        System.out.println("Bairro: " + cliente.getEndereco().getBairro());
        System.out.println("Cidade: " + cliente.getEndereco().getCidade());
        System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
        System.out.println("Estado: " + cliente.getEndereco().getEstado());
        System.out.println("Rua: " + cliente.getEndereco().getRua());
        System.out.println("Número: " + cliente.getEndereco().getNumero());
    }
}