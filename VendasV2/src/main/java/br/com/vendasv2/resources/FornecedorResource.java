package br.com.vendasv2.resources;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.vendasv2.dominio.Fornecedor;
import br.com.vendasv2.services.FornecedorService;



@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {

	private FornecedorService fornecedorService;
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id) {
		Fornecedor fornecedor = fornecedorService.buscarPorId(id);
		return ResponseEntity.ok().body(fornecedor);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> salvar(@RequestBody Fornecedor fornecedor) {
		fornecedor = fornecedorService.salvar(fornecedor);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(fornecedor.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@PathVariable Integer id, @RequestBody Fornecedor fornecedor) {
		fornecedor.setId(id);
		fornecedor = fornecedorService.atualizar(fornecedor);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable Integer id){
		fornecedorService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Fornecedor> lista = fornecedorService.listar();
		return ResponseEntity.ok().body(lista);
	}
}
