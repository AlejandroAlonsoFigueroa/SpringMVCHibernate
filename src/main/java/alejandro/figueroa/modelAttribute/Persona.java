package alejandro.figueroa.modelAttribute;

public class Persona {
	public String nombre;
	public String apellidos;
	public Integer edad;
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Persona() {
		this.nombre = "Alejandro";
		this.apellidos = "Alonso Figueroa";
		this.edad = 22;
	}
	public Persona(String nombre, String apellidos, Integer edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

}
