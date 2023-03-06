package alejandro.figueroa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import alejandro.figueroa.dominio.Usuario;

@Controller
@RequestMapping("/sesiones")
//@RequestMapping(value = {"/sesiones"})
public class MiControlador {

	@RequestMapping(value = "/sesion-iniciada", method = RequestMethod.POST)
	public String saludarPost(Usuario u) {
		//return "/WEB-INF/jsp/vista-saludar.jsp";
		System.out.println(u);
		System.out.println("_--------------------------------------_");
		System.out.println(u.getDireccionUs());
		return "sesion-iniciada";
	}
	
	@RequestMapping(value = "/iniciar-sesion", method = RequestMethod.GET)
	public String saludarGet() {
		return "iniciar-sesion";
	}
	
	@GetMapping()
	public String obtenerAlgo(@RequestParam(name = "usName") String nombreUsuario, 
			@RequestParam(value = "usPassword", required = false, defaultValue = "admin") String contra) {
		
		System.out.println("Nombre del usuario: "+nombreUsuario);
		System.out.println("Contraseña del usuario: "+contra);
		
		return "sesion-iniciada";
	}
	
	@GetMapping(value = "/productos/{categoria}/color/{codigoColor}")
	public String obtenerProductos(@PathVariable(value = "categoria", required = false) String cat, 
			@PathVariable(value = "codigoColor", required = false) String codigoColor) {
		
		System.out.println("Categoria: "+cat);
		System.out.println("Código del color: "+codigoColor);
		
		
		return "sesion-iniciada";
	}
	
	@GetMapping("/mapearUsuario")
	public String mapeoDeUsuarios(Usuario u) {
		
		System.out.println(u);
		
		
		System.out.println("_--------------------------------------_");
		System.out.println(u.getDireccionUs());
		return "sesion-iniciada";
	}
}
