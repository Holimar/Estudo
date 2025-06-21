
public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private int km;
	private double preco;
	
	public Carro() {
		System.out.println("Construtor");
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	void exibirAnuncio(){
		System.out.println("Anuncio do carro");
		System.out.println(marca+"-"+modelo+" ("+ano+")");
		System.out.println("Cor:"+cor+" KM: "+km+" R$ "+preco);
		
	}
	
	void simularSeguro(int perfil) {
		if (perfil == 0) {
			System.out.println("Perfil: Idoso - 1.5%");
			System.out.println("R$ "+preco*0.015);
		}
		
		else if (perfil == 1) {
			System.out.println("Perfil: Chefe de familia- 2.5%");
			System.out.println("R$ "+preco*0.025);
		}
		
		else if (perfil == 2) {
			System.out.println("Perfil: Jovem - 14%");
			System.out.println("R$ "+preco*0.14);
		}
		
		else {
			System.out.println("Não temos este perfil");
		}
		
	}
	
	double calcularIPVA() {
		double valorIPVA;
			if (ano <= 2002) {
				valorIPVA=0;
			}
			else {
				valorIPVA = preco * 0.035;
			}
			return valorIPVA;
		}
	}
	
