package br.com.dio.desafio.dominio;

import br.com.dio.desafio.constantes.Constantes;
import br.com.dio.desafio.interfaces.InterfaceConteudo;

public class Curso extends Constantes implements InterfaceConteudo {

	private int cargaHoraria;
	private String titulo;
    private String descricao;
    
	@Override
	public double calcularXP() {
		return xp_padrao*cargaHoraria;
	}

	@Override
	public String getTitulo() {
		
		return titulo;
	}

	@Override
	public String getDescrição() {
		// TODO Auto-generated method stub
		return descricao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}
	
	
	
	

}
