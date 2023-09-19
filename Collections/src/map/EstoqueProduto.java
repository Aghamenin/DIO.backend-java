package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map <Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
             for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco()> maiorPreco){
                    produtoMaisCaro = p;
                }
             }
        }
        return produtoMaisCaro;
       
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProdutos(1L, "Produto A", 10, 5.0);
        estoqueProduto.adicionarProdutos(2L, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProdutos(3L, "Produto C", 2, 15.0);
        estoqueProduto.adicionarProdutos(8L, "Produto D", 2, 20.0);

        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$ " + estoqueProduto.obterProdutoMaisCaro());
    }
}
