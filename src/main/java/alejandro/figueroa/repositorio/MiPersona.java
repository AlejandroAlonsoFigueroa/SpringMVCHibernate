package alejandro.figueroa.repositorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Persona")
@Table(name = "PERSONAS")
public class MiPersona {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	public MiPersona() {
	}

	@Override
	public String toString() {
		return "MiPersona [id=" + id + "]";
	}
	
	
	
}
