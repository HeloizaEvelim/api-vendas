package br.com.vendasv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vendasv2.dominio.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
