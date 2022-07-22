package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
	
	private String nome;
	private List<Curso> cursosInscritos = new ArrayList<>();
	private List<Mentoria> mentoriasInscritas = new ArrayList<>();
	private List<Curso> cursosConcluidos = new ArrayList<>();
	private List<Mentoria> mentoriasConcluidas = new ArrayList<>();
	
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
	}
	
	public void progredir() {
		
	}
	
	public double calcularTotalXp() {
	
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursosInscritos() {
		return cursosInscritos;
	}

	public void setCursosInscritos(List<Curso> cursosInscritos) {
		this.cursosInscritos = cursosInscritos;
	}

	public List<Mentoria> getMentoriasInscritas() {
		return mentoriasInscritas;
	}

	public void setMentoriasInscritas(List<Mentoria> mentoriasInscritas) {
		this.mentoriasInscritas = mentoriasInscritas;
	}

	public List<Curso> getCursosConcluidos() {
		return cursosConcluidos;
	}

	public void setCursosConcluidos(List<Curso> cursosConcluidos) {
		this.cursosConcluidos = cursosConcluidos;
	}

	public List<Mentoria> getMentoriasConcluidas() {
		return mentoriasConcluidas;
	}

	public void setMentoriasConcluidas(List<Mentoria> mentoriasConcluidas) {
		this.mentoriasConcluidas = mentoriasConcluidas;
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", cursosInscritos=" + cursosInscritos + ", mentoriasInscritas="
				+ mentoriasInscritas + ", cursosConcluidos=" + cursosConcluidos + ", mentoriasConcluidas="
				+ mentoriasConcluidas + "]";
	}
	

}
