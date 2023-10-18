package dio.padraoprojeto.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    public List<Cliente> findByEnderecoCep(String cep);
    public List<Cliente> findByEnderecoLocalidade(String cidade);
}