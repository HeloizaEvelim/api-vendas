package br.com.vendasv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vendasv2.dominio.Fornecedor;


@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
