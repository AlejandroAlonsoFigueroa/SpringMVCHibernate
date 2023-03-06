package alejandro.figueroa.formatter;

public class Usuario {

	private String nombre;
	private String apellidos;
	private Telefono tel;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Telefono getTel() {
		return tel;
	}
	public void setTel(Telefono tel) {
		this.tel = tel;
	}
	
	public Usuario() {}
}
