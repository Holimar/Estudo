
public class TesteProduto {
 public static void main(String[] args) {
	Produto p1, p2;
	p1 = new Produto("Caixa",22.22);
	p2 = new Produto("Caixa",2.22);
	
	System.out.println(p1.exibir());
	System.out.println(p2.exibir());
	
}
}
