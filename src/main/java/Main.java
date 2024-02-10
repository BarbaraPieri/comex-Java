import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        try {

            // Pedindo para o usuário digitar a quantidade do produto
            System.out.print("Digite a quantidade do produto: ");

            // Lendo a quantidade digitada pelo usuário
            int quantidade = scanner.nextInt();

            // Construindo a URI dinâmica com base na quantidade fornecida
            String uri = "https://fakestoreapi.com/products/" + quantidade;

            // Realizando a consulta à API externa
            String respostaAPI = APIRequest.consultarAPIExterna();

            // Imprimindo o resultado da consulta
            System.out.println("Resposta da API:");
            System.out.println(respostaAPI);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um valor numérico válido para a quantidade do produto.");
        } finally {
            // Fechando o objeto Scanner
            scanner.close();
        }
    }
}
