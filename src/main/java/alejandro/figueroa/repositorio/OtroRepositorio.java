package alejandro.figueroa.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.orm.jpa.JpaTransactionManager;
@Repository("otroRepositorio")
public class OtroRepositorio {
	
	@Autowired
	private JpaTransactionManager transactionManager;
	
	
	public void armarConsulta() {
		EntityManagerFactory fabricaManejadorEntidades = transactionManager.getEntityManagerFactory();
		
		EntityManager manejadorEntidades = fabricaManejadorEntidades.createEntityManager();
		
		EntityTransaction transaccion = manejadorEntidades.getTransaction();
		
		transaccion.begin();
		TypedQuery<MiPersona> consultaPersonas = manejadorEntidades.createQuery("from Persona", MiPersona.class);
		
		List<MiPersona> listaPersonas = consultaPersonas.getResultList();
		
		for(MiPersona p: listaPersonas) {
			System.out.println(p);
		}
		transaccion.commit();
		
		manejadorEntidades.close();
	}
}
