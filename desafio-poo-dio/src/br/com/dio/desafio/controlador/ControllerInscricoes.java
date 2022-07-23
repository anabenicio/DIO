package br.com.dio.desafio.controlador;

import java.util.List;
import java.util.Optional;

import br.com.dio.desafio.dominio.Dev;

public class ControllerInscricoes {

	public boolean jaInscrito(Dev dev, List conteudosInscritos) {

		if (conteudosInscritos.contains(dev)) {
			System.out.println("Você já está inscrito");
			return true;
		}

		else {

			System.out.println("");
			return false;
		}

	}

	public void realizarInscricao(Dev dev, List conteudosInscritos, List<Dev> usuariosInscritos, List getConteudo) {
		boolean jaEinscrito = jaInscrito(dev, conteudosInscritos);
		conteudosInscritos.addAll(getConteudo);
		if (!jaEinscrito) {
			usuariosInscritos.add(dev);
			System.out.println(dev);
		}

	}

	public void progredir(List conteudoInscrito, List conteudoConcluido, Optional optionalConteudo) {
		optionalConteudo = conteudoInscrito.stream().findFirst();
		if (optionalConteudo.isPresent()) {
			conteudoConcluido.add(optionalConteudo.get());
			conteudoInscrito.remove(optionalConteudo.get());

		} else
			System.err.println("Lista vazia");
	}

}
