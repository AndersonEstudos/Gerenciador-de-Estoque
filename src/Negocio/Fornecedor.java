package Negocio;

public abstract class Fornecedor extends ObjetoPadrao {

	private String telefone;
	private String email;
	private Endereco localizacao;

	public Endereco getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Endereco localizacao) {
		this.localizacao = localizacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
