package alejandro.figueroa.modelAttribute;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import alejandro.figueroa.repositorio.MiPersona;
import alejandro.figueroa.repositorio.OtroRepositorio;
import alejandro.figueroa.repositorio.Repositorio;

@Controller("controladorModelAttribute")
public class ControladorModelAttribute {

	@Autowired
	private Repositorio repo;
	
	//Inyectando el bean dataSource, si jaló jaja
	@Autowired 
	private DriverManagerDataSource dataSource;
	
	@Autowired 
	private OtroRepositorio otroRepo;
	
	@GetMapping("/hacerAlgo")
	public String hacerAlgo(@ModelAttribute("miPersona") Persona p, HttpServletRequest request) {
		try {
			System.out.println(dataSource);
			dataSource.getConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		otroRepo.armarConsulta();
		
		MiPersona pEntidad = new MiPersona();
		repo.save(pEntidad);
		return "vistaPersona";
	}
	
	
	@ModelAttribute("personaGeneral")
	public Persona obtenerPersonaGeneral() {
		return new Persona("Manuel", "Pérez", 23);
	}
}
