package Negocio;

public abstract class Item extends ObjetoPadrao {
	private Fornecedor origem;
	private String lote;
	private Armazem localizacao;
	

	public Armazem getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Armazem localizacao) {
		this.localizacao = localizacao;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Fornecedor getOrigem() {
		return origem;
	}

	public void setOrigem(Fornecedor origem) {
		this.origem = origem;
	}
	

}
