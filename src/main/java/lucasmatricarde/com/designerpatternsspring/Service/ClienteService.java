package lucasmatricarde.com.designerpatternsspring.Service;

import lucasmatricarde.com.designerpatternsspring.Model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
