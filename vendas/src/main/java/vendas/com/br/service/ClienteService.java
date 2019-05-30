package vendas.com.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vendas.com.br.repositorio.ClienteRepositorio;

@Service
public class ClienteService {
     
	@Autowired
	private ClienteRepositorio clienterep;
	
	
}
