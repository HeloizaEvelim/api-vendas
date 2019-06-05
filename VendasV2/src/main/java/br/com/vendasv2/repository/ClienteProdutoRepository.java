package br.com.vendasv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.vendasv2.dominio.ClienteProduto;
import br.com.vendasv2.dominio.ClienteProdutoPK;

@Repository
public interface ClienteProdutoRepository extends JpaRepository<ClienteProduto, ClienteProdutoPK>{

}
