import java.util.Scanner;
public class Municipal {
	public static void main(String[] args) {
		
		System.out.println("Digite o nome do livro");
		Scanner teclado = new Scanner(System.in);
		String tituloUsuario = teclado.nextLine();
		
		Livros l1,l2;
		l1 = new Livros();
		l2 = new Livros();
		
		l1.titulo = "Passos lentos";
		l1.anoPublicacao = 2026;
		l1.autor = "Holimar";
		l1.categoria = "Bibliografia";
		l1.estante = 5;
		l1.prateleira = 3;
		l1.status = "Disponivel";
		
		l2.titulo = "Amargurados";
		l2.anoPublicacao = 2027;
		l2.autor = "Holimar";
		l2.categoria = "Ficção";
		l2.estante = 8;
		l2.prateleira = 5;
		l2.status = "Alugado";
		
		l1.informacoes(tituloUsuario);
		
		
	
		
	}
}
