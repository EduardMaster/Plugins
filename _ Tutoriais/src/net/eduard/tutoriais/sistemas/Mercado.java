package net.eduard.tutoriais.sistemas;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	private List<MercadoProduto> produtos = new ArrayList<>();

	public List<MercadoProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<MercadoProduto> produtos) {
		this.produtos = produtos;
	}

}
