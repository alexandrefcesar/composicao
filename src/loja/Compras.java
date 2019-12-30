package loja;

import java.util.ArrayList;
import java.util.List;

public class Compras {

	List<Itens> itens = new ArrayList<>();

	public void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Itens(p, qtd));

	}
	public void adicionarItem(String nome, float preco, int qtd) {
		this.itens.add(new Itens(new Produto(nome,preco),qtd));
	}

	public double obterValorTotal() {
		double valor = 0;
		for (Itens item : itens) {
			valor = item.qtd * item.p.getPreco();
		}
		return valor;
	}

}
