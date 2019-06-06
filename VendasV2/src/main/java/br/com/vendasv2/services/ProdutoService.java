package br.com.vendasv2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.vendasv2.dominio.Produto;
import br.com.vendasv2.repository.ProdutoRepository;
import br.com.vendasv2.services.exceptions.ObjectNotFoundException;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto buscarPorId(Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Professor não encontrado! id: " + id));
	}
	
	public Produto salvar(Produto produto) {
		produto.setId(null);
		return produtoRepository.save(produto);
	}
	
	public Produto atualizar(Produto produto) {
		return produtoRepository.saveAndFlush(produto);
	}
	
	public void deletar(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
}

