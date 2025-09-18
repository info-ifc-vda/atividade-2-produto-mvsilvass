public class Loja {
    public static void main(String[] args) {
        Produto detergente = new Produto("Detergente", 5.4, 5);

        System.out.println("Quantidade em estoque: " + detergente.quantEstoque);
        System.out.println("Valor: " + detergente.valor);
        System.out.println("Valor Total: " + detergente.calcularValorTotal());

        detergente.alterarQuantidade(-10);
        System.out.println("Quantidade em estoque: " + detergente.quantEstoque);
        System.out.println("Valor Total: " + detergente.calcularValorTotal());

        detergente.escreverDados();

    }
}
