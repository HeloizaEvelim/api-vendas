package vendas.com.br.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vendas.com.br.dominio.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
