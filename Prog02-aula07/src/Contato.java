import java.time.LocalDate;

public class Contato {
	
	//JavaBean
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private LocalDate dataDeNascimento;
	
	public Contato() {}

	public Contato(int id, String nome, String email, String endereco, LocalDate dataDeNascimento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
	}	
}
