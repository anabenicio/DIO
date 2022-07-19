package execiciosList;

/*
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas s�o:
 * 1. Telefonou para a vitima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da v�tima?
 * 4. Devia para a v�tima?
 * 5. J� trabalhou com a v�tima?
 * 
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser
 * classificada como suspeita, entre 3 e 4 como C�mplice e 5 como
 * Assassina. Caso contr�rio, ela ser� classificada como Inocente.
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
