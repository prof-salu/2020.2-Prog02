
public class Aluno {
	private String matricula;
	private String nome;
	private String curso;

	public Aluno(String matricula, String nome, String curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "]";
	}

	public String getMatricula() {
		return matricula;
	}
}
