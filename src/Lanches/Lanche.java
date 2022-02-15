package Lanches;

import java.util.ArrayList;
import java.util.List;


public abstract class Lanche extends Cardapio {
	private double preco;
	private double distancia;
	private double tempoTotal;
	
	public Lanche() {}

	
	public void calcularTempo(double distancia) {
		double inteira,resto;
		this.tempoTotal = (distancia * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println(" 🕗 Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println(" "); 		
	}
	 
	public void fecharPedido() {
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		
	}

}
	


