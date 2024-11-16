package lucasmatricarde.com.designerpatternsspring.Repository;

import lucasmatricarde.com.designerpatternsspring.Model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}