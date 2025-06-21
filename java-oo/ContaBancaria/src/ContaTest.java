import java.util.Scanner;
public class ContaTest {
	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria(1997, 5, "Holimar", 460555, 1000000);
		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Exibir Dados da conta");
			System.out.println("4 - Exibir Saldo");
			System.out.println("5 - Sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
			System.out.println("Digite o valor do depósito:");
			double valorDeposito = teclado.nextDouble();
			conta1.depositar(valorDeposito);
			break;
			
			case 2:
				System.out.print("Digite o valor do saque:");
				double valorSaque = teclado.nextDouble();
				System.out.println(conta1.sacar(valorSaque));
				break;
				
			case 3:
				conta1.exibirDadosDaConta();
				break;
				
			case 4:
				conta1.exibirSaldo();
				break;
				
			case 5:
                System.out.println("Saindo do programa...");
                break;
				
			default:
                System.out.println("Opção inválida.");
			
			}
			
		
		}while (opcao != 5);
			
		
		teclado.close();
	}
}

