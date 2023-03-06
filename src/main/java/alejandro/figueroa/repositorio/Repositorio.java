package alejandro.figueroa.repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("miRepositorioJpa")
public interface Repositorio extends CrudRepository<MiPersona, Integer>{

	
}
