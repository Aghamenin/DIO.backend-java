package Main.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item>itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();
        for(Item i: removerItens){
            if(i.getClass().equals(removerItens)){
                removerItens.add(i);
            }
        }
        removerItens.removeAll(removerItens);
    }

    public double calcularValorTotal(){
        return itemList.size();
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("lápis", 1.50d, 2);
        carrinhoDeCompras.adicionarItem("Caderno", 21.50d, 1);
        carrinhoDeCompras.adicionarItem("Mochila", 40.99d, 1);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Caderno");

        
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        

        
    }
    
}
