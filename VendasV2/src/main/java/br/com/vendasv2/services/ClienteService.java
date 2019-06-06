package br.com.vendasv2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vendasv2.dominio.Cliente;
import br.com.vendasv2.repository.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	public Cliente buscarPorId(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado! ida: " + id));
	}
	
	public Cliente salvar(Cliente cliente) {
		cliente.setId(null);
		return clienteRepository.save(cliente);
	}
	
	public Cliente atualizar(Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}
	
	public void deletar(Integer id) {
		clienteRepository.deleteById(id);
	}
	
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
}
