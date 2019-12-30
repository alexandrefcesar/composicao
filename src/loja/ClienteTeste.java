package loja;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		Compras k = new Compras();
		k.adicionarItem("gilete", 5, 2);
		
		Cliente c = new Cliente("Pedro","doido",012312321);
		c.compra.add(k);
		System.out.println(c.obterValorTotal());

	}

}
 