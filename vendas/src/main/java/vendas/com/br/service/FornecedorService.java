package vendas.com.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vendas.com.br.repositorio.FornecedorRepositorio;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepositorio fornecedorrep;
	
	
}
