package Lanches;

public class Salgado extends Lanche {
	
	private String tipoSalgado, salgadoEscolhido;
	private double tempoTotal;

	public String getTipoSalgado() {
		return tipoSalgado;
	}

	public void setTipoSalgado(String tipoSalgado) {
		this.tipoSalgado = tipoSalgado;
	}

	public String getSalgadoEscolhido() {
		return salgadoEscolhido;
	}

	public void setSalgadoEscolhido(String salgadoEscolhido) {
		this.salgadoEscolhido = salgadoEscolhido;
	}

	@Override
	public void calcularTempo(double distancia) {
		double inteira,resto;
		this.tempoTotal = (distancia * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println(" 🕗 Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println(" "); 	
		
	}

	@Override
	public void fecharPedido() {
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ 5,50");
		System.out.println(" ");		
		
	}
	

}
