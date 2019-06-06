package br.com.vendasv2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vendasv2.dominio.Fornecedor;
import br.com.vendasv2.repository.FornecedorRepository;
import br.com.vendasv2.services.exceptions.ObjectNotFoundException;




@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public Fornecedor buscarPorId(Integer id) {
		Optional<Fornecedor> obj = fornecedorRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Fornecedor não encontrado! id: " + id));
	}
	public Fornecedor salvar(Fornecedor fornecedor) {
		fornecedor.setId(null);
		return fornecedorRepository.save(fornecedor);
	}
	
	public Fornecedor atualizar(Fornecedor fornecedor) {
		return fornecedorRepository.saveAndFlush(fornecedor);
	}
	
	public void deletar(Integer id) {
		fornecedorRepository.deleteById(id);
	}
	
	public List<Fornecedor> listar(){
		return fornecedorRepository.findAll();
	}
}