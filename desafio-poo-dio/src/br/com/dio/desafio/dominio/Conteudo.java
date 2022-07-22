package br.com.dio.desafio.dominio;

import br.com.dio.desafio.constantes.Constantes;
import br.com.dio.desafio.interfaces.InterfaceConteudo;

public class Conteudo extends Constantes implements InterfaceConteudo{

	private String titulo;
    private String descricao;
	@Override
	public double calcularXP() {
		return xp_padrao;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String getDescrição() {
		return descricao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
