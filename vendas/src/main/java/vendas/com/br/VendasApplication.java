package vendas.com.br;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vendas.com.br.dominio.Cliente;
import vendas.com.br.dominio.Fornecedor;
import vendas.com.br.dominio.Produto;
import vendas.com.br.repositorio.ClienteRepositorio;
import vendas.com.br.repositorio.FornecedorRepositorio;
import vendas.com.br.repositorio.ProdutoRepositorio;

@SpringBootApplication
public class VendasApplication implements CommandLineRunner{

	
	@Autowired
	private ClienteRepositorio clienterep; 
	
	@Autowired
	private FornecedorRepositorio fornecedorrep;
	
	@Autowired
	private ProdutoRepositorio produtorep;
	
	public static void main(String[] args) {
		
	}

	@Override
	public void run(String... args) throws Exception {
		
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
    cliente.setCpf(420800000);
    cliente.setNome("Helena");
    cliente.setEndereco("Agamenon");
    cliente.setIdade(24);
    
    Cliente cliente2 = new Cliente();
    cliente2.setCpf(972345969);
    cliente2.setNome("Joyce");
    cliente2.setEndereco("Rua da Compesa");
    cliente2.setIdade(26);
    
    clienterep.save(cliente);
    clienterep.save(cliente2);
    
    Fornecedor fornecedor = new Fornecedor();
    fornecedor.setCnpj(1324447770);
    fornecedor.setNome("Marcos");
    fornecedor.setEndereco("Avenida Paraiba");
    
    Fornecedor fornecedor2 = new Fornecedor();
    fornecedor2.setCnpj(221888500);
    fornecedor2.setNome("Antonio");
    fornecedor2.setEndereco("Rua Goias");
    
    fornecedorrep.save(fornecedor);
    fornecedorrep.save(fornecedor2);
    
    
		
	}

}
