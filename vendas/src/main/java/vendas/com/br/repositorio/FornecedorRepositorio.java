package vendas.com.br.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vendas.com.br.dominio.Fornecedor;

@Repository
public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Integer>{

}
