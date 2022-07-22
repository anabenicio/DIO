package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
	
	private String nome;
	private List<Curso> cursosInscritos = new ArrayList<>();
	private List<Mentoria> mentoriasInscritas = new ArrayList<>();
	private List<Curso> cursosConcluidos = new ArrayList<>();
	private List<Mentoria> mentoriasConcluidas = new ArrayList<>();
	private int countCursosIncritos = cursosInscritos.size();
	private int countCursosConcluidos = cursosInscritos.size();
	
	
	public Dev() {
		
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		boolean jaEinscrito = bootcamp.jaInscrito(Dev.this, cursosInscritos);
		this.cursosInscritos.addAll(bootcamp.getCursos());
		this.mentoriasInscritas.addAll(bootcamp.getMentoria());
		
		if(!jaEinscrito) {
			bootcamp.getDevsInscritos().add(this);
			System.out.println(bootcamp.getDevsInscritos());
		}
		
	}
	
	public void inscreverCurso() {
		
	}
	
	public void inscreverMentoria() {
		
	}
	
	public void progredirBootcamp() {
		if(cursosInscritos.isEmpty()&&mentoriasInscritas.size()!=0)
			progredirMentoria();
		else if(mentoriasInscritas.isEmpty()&&cursosInscritos.size()!=0)
			progredirCurso();
		else {
			progredirCurso();
			progredirMentoria();
						}
			
		
	}
	public void progredirCurso() {
		Optional<Curso> curso = this.cursosInscritos.stream().findFirst();
		if(curso.isPresent()) {
			this.cursosConcluidos.add(curso.get());
			this.cursosInscritos.remove(curso.get());
		} else
			System.err.println("Lista de cursos vazia");
		
	}
	
	public void progredirMentoria() {
		Optional<Mentoria> mentoria = this.mentoriasInscritas.stream().findFirst();
		if(mentoria.isPresent()) {
			this.mentoriasConcluidas.add(mentoria.get());
			this.mentoriasInscritas.remove(mentoria.get());
		} else
			System.err.println("Lista de mentorias vazia");
		
	}
	
	public double calcularTotalXp() {
		
		double totalXP = this.cursosConcluidos
                .stream()
                .mapToDouble(Curso::calcularXP)
                .sum();
		totalXP +=this.mentoriasConcluidas
                .stream()
                .mapToDouble(Mentoria::calcularXP)
                .sum();
	
		return  totalXP;
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
