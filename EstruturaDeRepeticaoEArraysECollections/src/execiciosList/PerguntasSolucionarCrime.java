package execiciosList;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas são:
 * 1. Telefonou para a vitima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da vítima?
 * 4. Devia para a vítima?
 * 5. Já trabalhou com a vítima?
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como suspeita, entre 3 e 4 como Cúmplice e 5 como
 * Assassina. Caso contrário, ela será classificada como Inocente.
 */
public class PerguntasSolucionarCrime {
	private String pergunta;
	private boolean resposta;

	public PerguntasSolucionarCrime(String pergunta, boolean resposta) {
		super();
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public boolean getResposta() {
		return resposta;
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "PerguntasSolucionarCrime [pergunta=" + pergunta + ", resposta=" + resposta + "]";
	}

}
