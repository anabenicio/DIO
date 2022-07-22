package br.com.dio.desafio.controlador;

import java.util.List;

import br.com.dio.desafio.dominio.Dev;

public class RealizarInscricao {
	

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

	public void realizarInscricao(Dev dev,List conteudosInscritos,
			List<Dev> usuariosInscritos, List getBootcamp) {
		boolean jaEinscrito = jaInscrito(dev, conteudosInscritos);
		conteudosInscritos.addAll(getBootcamp);
		if (!jaEinscrito) {
			usuariosInscritos.add(dev);
			System.out.println(dev);
		}
		

	}

	
}
