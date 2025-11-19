package stream_api_java;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();	
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
	    Item item = new Item(nome, preco, quantidade);
	    this.itemList.add(item);
	  }
	//Metodo p/Calcular valor total dos Itens utilizando Streams API
	public double calcularValorTotal() {
		if(itemList.isEmpty()) {
			throw new RuntimeException("A lista esta vazia!");
		}
		return itemList.stream().mapToDouble(
				   item -> item.getPreco() * item.getQuantidade()).sum();
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("Mouse", 5, 10);
		carrinho.adicionarItem("Teclado", 8, 10);
		carrinho.adicionarItem("TV", 7, 20);
		carrinho.adicionarItem("Panela", 15, 10);
		carrinho.adicionarItem("Radio", 6, 20);
		double valor = carrinho.calcularValorTotal();
        System.out.println("O valor total: "+valor);
	}

}
