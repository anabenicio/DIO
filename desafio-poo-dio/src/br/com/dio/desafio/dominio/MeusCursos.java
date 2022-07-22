package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class MeusCursos {
	
	Curso curso = new Curso();
	
	private List<Curso> cursos = new ArrayList<>();


	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> conteudos) {
		this.cursos = conteudos;
	}


	@Override
	public String toString() {
		return "MeusCursos [cursos=" + cursos + "]";
	}
	
	
}
