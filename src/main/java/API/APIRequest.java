package API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import API.Product;
import com.google.gson.Gson;


public class APIRequest {
    public static String consultarAPIExterna() {
        // Criando um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Criando uma requisição GET para a URI da API externa
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://fakestoreapi.com/products/1"))
                .GET()
                .build();

        try {
            // Enviando a requisição e obtendo a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificando se a resposta foi bem-sucedida (código 200)
            if (response.statusCode() == 200) {
                // Retornando o corpo da resposta
                return response.body();
            } else {
                System.out.println("Erro ao fazer a requisição: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao fazer a requisição: " + e.getMessage());
        }
        return ""; // Em caso de erro, retornar uma string vazia
        }
        public static Product desserializarProduto(String json) {
        // Desserializar o JSON retornado pela API em um objeto Product
        Gson gson = new Gson();
        Product product = gson.fromJson(json, Product.class);
        return product;
    }
}
