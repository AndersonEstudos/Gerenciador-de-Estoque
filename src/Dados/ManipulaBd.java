package Dados;
import Negocio.ObjetoPadrao;

public interface ManipulaBd 
{
	public ObjetoPadrao BuscarporIdentificador(int identificador);
	public ObjetoPadrao BuscarporNome(String nome);
	public void Remover(int identificador);
	public void Update();
	public void Enviar();
}
