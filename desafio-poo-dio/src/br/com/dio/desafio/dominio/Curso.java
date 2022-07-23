package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.constantes.Constantes;
import br.com.dio.desafio.interfaces.InterfaceConteudo;

public class Curso extends Constantes implements InterfaceConteudo {

	private int cargaHoraria;
	private String titulo;
	private String descricao;
	private List<Dev> devsInscritos = new ArrayList<>();

	public Curso() {

	}

	@Override
	public double calcularXP() {
		return xp_padrao * cargaHoraria;
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

	public List<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(List<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	/*
	 * public List<Curso> getCursos() { return cursos; }
	 * 
	 * public void setCursos(List<Curso> cursos) { this.cursos = cursos; }
	 */

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}

}
