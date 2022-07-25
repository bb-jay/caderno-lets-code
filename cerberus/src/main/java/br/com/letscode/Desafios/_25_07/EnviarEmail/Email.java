package br.com.letscode.Desafios._25_07.EnviarEmail;

public class Email {
	private String de;
	private String para;
	private String assunto;
	private String textoNaoFormatado;
	private String texto;
	private boolean enviado;

	public void restaurar() {
		this.texto = this.textoNaoFormatado;
	}

	public void tirarAcentos() {
		this.texto = new Formatador().removerAcentuacao(this.texto);
	}

	public void paraMaiusculas() {
		this.texto = new Formatador().paraMaiusculas(this.texto);
	}

	public void paraMinusculas() {
		this.texto = new Formatador().paraMinusculas(this.texto);
	}

	public void paraCamelCase() {
		this.texto = new Formatador().paraCamelCase(this.texto);
	}

	public void enviar() {
		if (this.enviado) {
			System.out.println("Mensagem já enviada...");
			return;
		}
		System.out.println("Mensagem enviada!");
		this.enviado = true;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.textoNaoFormatado = texto;
	}

	@Override
	public String toString() {
		return String.format(
			"DE: %s%nPARA: %s%nASSUNTO: %s%nTEXTO: %s%n",
			this.de,
			this.para,
			this.assunto,
			this.texto
		);
	}
}
