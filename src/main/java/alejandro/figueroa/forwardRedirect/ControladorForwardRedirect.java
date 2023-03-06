package alejandro.figueroa.forwardRedirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class ControladorForwardRedirect {

	/*@GetMapping("/llenarVariables")
	public String agregarVariables(Model modelo) {
		modelo.addAttribute("miNombre", "El nombre que es mio");
		return "forward:/verVariables";
	}*/
	
	@GetMapping("/llenarVariables")
	public String agregarVariables(Model modelo) {
		modelo.addAttribute("miNombre", "El nombre que es mio");
		return "redirect:/verVariables";
	}
	@GetMapping("/verVariables")
	public String ambitoVariables() {
		return "vistaVariables";
	}
	
}
