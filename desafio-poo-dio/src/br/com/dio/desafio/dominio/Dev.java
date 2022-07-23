package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.dio.desafio.controlador.ControllerInscricoes;

public class Dev {

	private String nome;
	private List<Curso> cursosInscritos = new ArrayList<>();
	private List<Mentoria> mentoriasInscritas = new ArrayList<>();
	private List<Curso> cursosConcluidos = new ArrayList<>();
	private List<Mentoria> mentoriasConcluidas = new ArrayList<>();
	private List<Bootcamp> bootcampsInscritos = new ArrayList<>();
	private List<Bootcamp> bootcampsConcluidos = new ArrayList<>();
	private Optional<Curso> curso;
	private Optional<Mentoria> mentoria;

	ControllerInscricoes controllerInscricao = new ControllerInscricoes();

	public Dev() {

	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		controllerInscricao.realizarInscricao(this, this.bootcampsInscritos, bootcamp.getDevsInscritos(),
				bootcamp.getCursos());
		controllerInscricao.realizarInscricao(this, this.bootcampsInscritos, bootcamp.getDevsInscritos(),
				bootcamp.getMentoria());
		bootcamp.getDevsInscritos().add(this);

	}

	public void inscreverCurso(MeusCursos meusCursos) {
		Curso curso = new Curso();
		controllerInscricao.realizarInscricao(this, this.cursosInscritos, curso.getDevsInscritos(),
				meusCursos.getCursos());
	}

	public void inscreverMentoria(MinhasMentorias minhasMentorias) {
		Mentoria mentoria = new Mentoria();
		controllerInscricao.realizarInscricao(this, this.mentoriasInscritas, mentoria.getDevsInscritos(),
				minhasMentorias.getMinhasMentoria());
	}

	public void progredirBootcamp() {
		if (cursosInscritos.isEmpty() && mentoriasInscritas.size() != 0)
			controllerInscricao.progredir(bootcampsInscritos, bootcampsConcluidos, mentoria);
		else if (mentoriasInscritas.isEmpty() && cursosInscritos.size() != 0)
			controllerInscricao.progredir(bootcampsInscritos, bootcampsConcluidos, curso);
		else {
			controllerInscricao.progredir(bootcampsInscritos, bootcampsConcluidos, mentoria);
			controllerInscricao.progredir(bootcampsInscritos, bootcampsConcluidos, curso);
		}
	}

	public void progredirCurso() {

		controllerInscricao.progredir(cursosInscritos, cursosConcluidos, curso);
	}

	public void progredirMentoria() {
		controllerInscricao.progredir(mentoriasInscritas, mentoriasConcluidas, mentoria);

	}

	public double calcularTotalXp() {

		double totalXP = this.cursosConcluidos.stream().mapToDouble(Curso::calcularXP).sum();
		totalXP += this.mentoriasConcluidas.stream().mapToDouble(Mentoria::calcularXP).sum();

		return totalXP;
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

	public List<Bootcamp> getBootcampsInscritos() {
		return bootcampsInscritos;
	}

	public void setBootcampsInscritos(List<Bootcamp> bootcampsInscritos) {
		this.bootcampsInscritos = bootcampsInscritos;
	}

	public List<Bootcamp> getBootcampsConcluidos() {
		return bootcampsConcluidos;
	}

	public void setBootcampsConcluidos(List<Bootcamp> bootcampsConcluidos) {
		this.bootcampsConcluidos = bootcampsConcluidos;
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", cursosInscritos=" + cursosInscritos + ", mentoriasInscritas="
				+ mentoriasInscritas + ", cursosConcluidos=" + cursosConcluidos + ", mentoriasConcluidas="
				+ mentoriasConcluidas + ", bootcampsInscritos=" + bootcampsInscritos + "]";
	}

}
