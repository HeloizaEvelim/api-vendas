package br.com.vendasv2.dominio;



public enum SituacaoCliente {
	
	COMPRA_APROVADA(1, "Compra_Aprovada"),
	COMPRA_REPROVADA(2, "Compra_Reprovada");
	
	private int codigo;
	private String descricao;
	
	private SituacaoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static SituacaoCliente toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		for(SituacaoCliente o : SituacaoCliente.values()) {
			if(o.getCodigo() == codigo.intValue()) {
				return o;
			}
		}
		throw new IllegalArgumentException("Código inválido: " + codigo);
	}
	
}
