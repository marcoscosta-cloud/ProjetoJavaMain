
public class Bebida extends Item {
	
	private String nomeBebida;
	private int volume;
	private boolean bebidaAlcoolica;
	
	public String getNomeBebida() {
		return nomeBebida;
	}
	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}
	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
	
}
