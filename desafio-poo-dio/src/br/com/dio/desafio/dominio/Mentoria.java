package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.constantes.Constantes;
import br.com.dio.desafio.interfaces.InterfaceConteudo;

public class Mentoria extends Constantes implements InterfaceConteudo {

	private String titulo;
    private String descricao;
    private LocalDate data;
    private List<Dev> devsInscritos = new ArrayList<>();
    
	@Override
	public double calcularXP() {
		return xp_padrao + 20d;
	}

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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	
	
	

}
