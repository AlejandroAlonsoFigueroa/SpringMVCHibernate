package alejandro.figueroa.formatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorHacerFormatter {

	@GetMapping(value = "obtener-formulario")
	public String obtenerFormulario() {
		
		return "formularioUsuario";
	}
	
	@PostMapping(value = "recibir-usuario")
	public String recibirUsuario(Usuario u) {
		return "vistaUsuario";
	}
}
