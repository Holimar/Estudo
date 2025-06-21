
public class Livros {
	String titulo;
	String autor;
	int anoPublicacao;
	String categoria;
	int estante;
	int prateleira;
	String status;
	

	void informacoes(String  tituloUsuario) {
		if(tituloUsuario.equals(titulo)) {
			System.out.println("Ano de publicação:" + anoPublicacao + "Autor:" + autor + "Publicado em " + anoPublicacao);
			System.out.println("Categoria:" + categoria + "Estante:" + estante + "Prateleira:" + prateleira + "Situacao" + status );
		}
		else {
			System.out.println("Titulo não encontrado");
		}
		
	}
	
}
