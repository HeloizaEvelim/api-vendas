package br.com.vendasv2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.vendasv2.repository.ClienteProdutoRepository;
import br.com.vendasv2.repository.ClienteRepository;
import br.com.vendasv2.repository.FornecedorRepository;
import br.com.vendasv2.repository.ProdutoRepository;
import br.com.vendasv2.dominio.Fornecedor;
import br.com.vendasv2.dominio.Produto;
import br.com.vendasv2.dominio.SituacaoCliente;
import br.com.vendasv2.dominio.Cliente;
import br.com.vendasv2.dominio.ClienteProduto;

@SpringBootApplication
public class VendasV2Application implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienterep; 
	
	@Autowired
	private FornecedorRepository fornecedorrep;
	
	@Autowired
	private ProdutoRepository produtorep;
	
	@Autowired
	private ClienteProdutoRepository clienteprodutorep;
	
	public static void main(String[] args) {
		SpringApplication.run(VendasV2Application.class, args);
				
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Produto produto = new Produto();
	    produto.setId(1);
	    produto.setDescricao("Maquiagem");
	    produto.setValor(12);
	    
	    Produto produto2 = new Produto();
	    produto2.setId(2);
	    produto2.setDescricao("Creme");
	    produto2.setValor(18);
	    
	    produtorep.saveAll(Arrays.asList(produto, produto2));
		
	    Cliente cliente = new Cliente();
	    cliente.setCpf("09840619403");
	    cliente.setNome("Helena");
	    cliente.setEndereco("Agamenon");
	    cliente.setIdade(24);
	    
	    Cliente cliente2 = new Cliente();
	    cliente2.setCpf("41093107847");
	    cliente2.setNome("Joyce");
	    cliente2.setEndereco("Rua da Compesa");
	    cliente2.setIdade(26);
	    
	    clienterep.save(cliente);
	    clienterep.save(cliente2);
	    
	    Fornecedor fornecedor = new Fornecedor();
	    fornecedor.setCnpj("1324447770");
	    fornecedor.setNome("Marcos");
	    fornecedor.setEndereco("Avenida Paraiba");
	    
	    Fornecedor fornecedor2 = new Fornecedor();
	    fornecedor2.setCnpj("221888500");
	    fornecedor2.setNome("Antonio");
	    fornecedor2.setEndereco("Rua Goias");
	    
	    fornecedorrep.save(fornecedor);
	    fornecedorrep.save(fornecedor2);
	    
	    ClienteProduto clienteproduto = new ClienteProduto();
	    clienteproduto.getId().setCliente(cliente);
	    clienteproduto.getId().setProduto(produto);
	    clienteproduto.setEstoque(18);
	    clienteproduto.setSituacao(SituacaoCliente.COMPRA_APROVADA);
	    
	    ClienteProduto clienteproduto2 = new ClienteProduto();
	    clienteproduto2.getId().setCliente(cliente);
	    clienteproduto2.getId().setProduto(produto);
	    clienteproduto2.setEstoque(14);
	    clienteproduto2.setSituacao(SituacaoCliente.COMPRA_REPROVADA);
	    
	    clienteprodutorep.save(clienteproduto);
	    clienteprodutorep.save(clienteproduto2);
	}

}
