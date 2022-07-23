package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.MeusCursos;
import br.com.dio.desafio.dominio.MinhasMentorias;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso da Dio de Java");
		curso1.setCargaHoraria(60);
		// System.out.println(curso1);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Spring");
		curso2.setDescricao("Curso da Dio de Spring");
		curso2.setCargaHoraria(40);
		// System.out.println(curso2);

		Curso curso3 = new Curso();
		curso3.setTitulo("Curso Flutter");
		curso3.setDescricao("Curso da Dio de Flutter");
		curso3.setCargaHoraria(40);

		// System.out.println(curso3);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria da Dio de Java");
		mentoria1.setData(LocalDate.now());
		// System.out.println(mentoria1);

		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria Dio");
		mentoria2.setDescricao("Mentoria da Dio");
		mentoria2.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setTitulo("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developper");
		bootcamp.getCursos().add(curso1);
		bootcamp.getCursos().add(curso2);
		bootcamp.getMentoria().add(mentoria1);
		// System.out.println(bootcamp);

		MeusCursos meusCursos = new MeusCursos();
		meusCursos.getCursos().add(curso3);

		MinhasMentorias minhasMentorias = new MinhasMentorias();
		minhasMentorias.getMinhasMentoria().add(mentoria2);

		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		devAna.inscreverCurso(meusCursos);
		devAna.inscreverMentoria(minhasMentorias);
		devAna.progredirBootcamp();
		devAna.progredirCurso();
		devAna.progredirMentoria();
		System.out.println("Cursos Inscritos Ana" + devAna.getCursosInscritos());
		System.out.println("Cursos concluídos Ana: " + devAna.getCursosConcluidos());
		System.out.println("Bootcamps Inscritos Ana: " + devAna.getBootcampsInscritos());
		System.out.println("Bootcamps concluídos Ana: " + devAna.getBootcampsConcluidos());
		System.out.println("Mentorias Inscritas Ana" + devAna.getMentoriasInscritas());
		System.out.println("Mentorias concluídas Ana: " + devAna.getMentoriasConcluidas());
		System.out.println("XP: " + devAna.calcularTotalXp());
	}

}
