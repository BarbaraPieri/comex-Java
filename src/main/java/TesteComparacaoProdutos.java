public class TesteComparacaoProdutos {
    public static void main(String[] args) {
        // Criando dois produtos
        Produto produto1 = new Produto("Lapiseira", "Lapiseira 0,7 Pentel", 25.99, 20);
        Produto produto2 = new Produto("Caneta", "Caneta gel com gliter prata", 9.99, 50);

        // Comparando os produtos
        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais.");
        } else {
            System.out.println("Os produtos são diferentes.");
        }
    }
}
