package alejandro.figueroa.dominio;

public class Usuario {
	private String nombreUsuario;
	private String contra;
	private Direccion direccionUs;
	
	
	public Usuario() {
		
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}


	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", contra=" + contra + ", direccionUs=" + direccionUs + "]";
	}

	public Direccion getDireccionUs() {
		return direccionUs;
	}

	public void setDireccionUs(Direccion direccionUs) {
		this.direccionUs = direccionUs;
	}
	
	
}
