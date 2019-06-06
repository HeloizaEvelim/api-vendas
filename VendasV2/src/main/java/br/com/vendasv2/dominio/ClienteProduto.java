package br.com.vendasv2.dominio;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import br.com.vendasv2.dominio.ClienteProdutoPK;


@Entity
@Table(name = "cliente_produto")
public class ClienteProduto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClienteProdutoPK id = new ClienteProdutoPK();
	
	private Integer estoque;
	private Integer situacao;
	
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public SituacaoCliente getSituacao() {
		return SituacaoCliente.toEnum(situacao);
	}
	public void setSituacao(SituacaoCliente situacao) {
		this.situacao = situacao.getCodigo();
	}
	public ClienteProdutoPK getId() {
		return id;
	}
	public void setId(ClienteProdutoPK id) {
		this.id = id;
	}
	
	

}
