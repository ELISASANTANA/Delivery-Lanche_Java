package Lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche{
	private double tempoTotal;
	private double preco;
		
	List<String> ingredientes = new ArrayList<>();
	
	
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		
	}
	
	public void getIngrediente() {
		System.out.println("  Você escolheu os ingredientes: " + this.ingredientes);
		
	}
	
	public Sanduiche() {
		
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public void fecharPedido() {
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ " + getPreco());
		System.out.println(" ");		
	}


}
