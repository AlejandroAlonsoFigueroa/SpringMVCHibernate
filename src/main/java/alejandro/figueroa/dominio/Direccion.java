package alejandro.figueroa.dominio;

public class Direccion {

	private String calle;
	private String avenida;
	private String numeroCasa;
	
	public Direccion() {
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", avenida=" + avenida + ", numeroCasa=" + numeroCasa + "]";
	}
	
	
}
