package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(30);

	private String descricao;
	private String titulo;

	private List<Dev> devsInscritos = new ArrayList<>();
	private List<Curso> conteudos = new ArrayList<>();
	private List<Mentoria> mentoria = new ArrayList<>();

	public boolean jaInscrito(Dev dev) {

		if (devsInscritos.contains(dev))
			return true;

		return false;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(List<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	

	public List<Curso> getConteudos() {
		return conteudos;
	}

	public void setConteudos(List<Curso> conteudos) {
		this.conteudos = conteudos;
	}

	public List<Mentoria> getMentoria() {
		return mentoria;
	}

	public void setMentoria(List<Mentoria> mentoria) {
		this.mentoria = mentoria;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public String toString() {
		return "Bootcamp [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", descricao=" + descricao
				+ ", titulo=" + titulo + ", devsInscritos=" + devsInscritos + ", conteudos=" + conteudos + ", mentoria="
				+ mentoria + "]";
	}
	
	

}
