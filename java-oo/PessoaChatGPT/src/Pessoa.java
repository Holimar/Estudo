
public class Pessoa {
	private String nome;
	private int idade;
	private String email;
	
	public Pessoa (String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	void exibirInformacoes(){
		System.out.println(nome);
		System.out.println(email);
		System.out.println(idade);
	}
	
}
