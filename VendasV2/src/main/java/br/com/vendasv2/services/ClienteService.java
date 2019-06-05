package br.com.vendasv2.services;

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
	
}
