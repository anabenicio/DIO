package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class MinhasMentorias {

	Mentoria mentoria = new Mentoria();

	private List<Mentoria> minhasMentoria = new ArrayList<>();

	public List<Mentoria> getMinhasMentoria() {
		return minhasMentoria;
	}

	public void setMinhasMentoria(List<Mentoria> minhasMentoria) {
		this.minhasMentoria = minhasMentoria;
	}

	@Override
	public String toString() {
		return "MinhasMentorias [mentoria=" + mentoria + ", minhasMentoria=" + minhasMentoria + "]";
	}

}
