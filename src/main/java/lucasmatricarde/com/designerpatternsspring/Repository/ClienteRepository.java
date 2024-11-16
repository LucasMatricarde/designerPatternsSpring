package lucasmatricarde.com.designerpatternsspring.Repository;

import lucasmatricarde.com.designerpatternsspring.Model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
