package br.com.vendasv2.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "fornecedores")
public class Fornecedor implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(length = 80, nullable = false)
	private String endereco;

	@Column(length = 80, nullable = false)
	private String cnpj;
	

 	
	
	public String getCnpj() {
		return cnpj;
	}
	

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
