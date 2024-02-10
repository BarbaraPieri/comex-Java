import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário digitar a quantidade do produto
        System.out.print("Digite a quantidade do produto: ");

        // Lendo a quantidade digitada pelo usuário
        int quantidade = scanner.nextInt();

        // Criando um objeto Livro com os dados fornecidos pelo usuário
        Livro livro = new Livro("Nome do Livro", "Descrição do Livro", 0.0, quantidade, "ISBN do Livro", 0);

        // Imprimindo os dados do livro
        livro.imprimirDados();

        // Criando um objeto Eletronico com os dados fornecidos pelo usuário
        System.out.println("\nAgora, vamos criar um produto eletrônico:");

        // Pedindo para o usuário digitar a voltagem do eletrônico
        System.out.print("Digite a voltagem do eletrônico: ");
        int voltagem = scanner.nextInt();

        // Pedindo para o usuário digitar a potência do eletrônico
        System.out.print("Digite a potência do eletrônico: ");
        int potencia = scanner.nextInt();

        // Criando um objeto Eletronico com os dados fornecidos pelo usuário
        Eletronico eletronico = new Eletronico("Nome do Eletrônico", "Descrição do Eletrônico", 0.0, quantidade, voltagem, potencia);

        // Imprimindo os dados do eletrônico
        eletronico.imprimirDados();

        // Fechando o objeto Scanner
        scanner.close();
    }
}
