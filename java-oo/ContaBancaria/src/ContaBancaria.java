
public class ContaBancaria {

	private int numeroConta;
	private int digitoVerificador;
	private String nome;
	private int cpf;
	private double saldo;
	
	public ContaBancaria(int numeroConta,int digitoVerificador,String nome,int cpf,double saldo) {
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Depósito de R$ " + valorDeposito + " realizado.");
	}
	
	public String sacar(double valorSaque) {
		if(valorSaque>saldo) {
			return "Saque invalido";
		}
		else {
			saldo -= valorSaque;
			return "Saque de R$ " + valorSaque + " realizado. Saldo atual: R$ " + saldo;
		}
	}
	
	public void exibirDadosDaConta() {
		System.out.println(numeroConta);
		System.out.println(digitoVerificador);
		System.out.println(nome);
		System.out.println(cpf);
		
	}
	
	public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
	
}
}
