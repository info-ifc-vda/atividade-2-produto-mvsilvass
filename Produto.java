public class Produto{
    String nome;
    double valor;
    int quantEstoque;

    public Produto(String nome, double valor, int quantEstoque){
        this.nome = nome;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
    }

    public void escreverDados(){
        System.out.println("----------------------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("VALOR: " + this.valor);
        System.out.println("QUANTIDADE EM ESTOQUE: " + this.quantEstoque);
        System.out.println("----------------------------");
    }
    public void alterarQuantidade(int quantEstoque){
        this.quantEstoque = quantEstoque;
    }

    public double calcularValorTotal(){
        return quantEstoque * valor;
    }
}