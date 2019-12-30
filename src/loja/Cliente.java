package loja;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int cpf;
    List<Compras> compra = new ArrayList<>();

	public Cliente(String nome, String sobrenome, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
    public double obterValorTotal() {
    	double valor=0;
    	
    	for (Compras c:compra) {
    		valor+= c.obterValorTotal();
    		
    	}
    	
    	return valor;
    }
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + "]";
	}

}
