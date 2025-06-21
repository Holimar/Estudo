
public class UaiBiMotors {
	public static void main(String[] args) {
		Carro c1, c2;
		c1 = new Carro();
		c2 = new Carro();

		/*
		 * c1.setMarca("Porshe"); c1.setModelo("Cayenne"); c1.setAno(2022); c1.setKm(0);
		 * c1.setCor("Branca"); c1.setPreco(2200000);
		 */

		/*
		 * c2.setMarca("Chevrolet"); c2.setModelo("Corsa"); c2.setAno(1998);
		 * c2.setKm(25000); c2.setCor("Cinza"); c2.setPreco(8000.00);
		 */

		c1.exibirAnuncio();
		c1.simularSeguro(3);
		c2.exibirAnuncio();

		/*
		 * System.out.println("----calculo IPVA dos veiculos---- "); double ipvaC1 =
		 * c1.calcularIPVA(); double ipvaC2 = c2.calcularIPVA();
		 * 
		 * if (ipvaC1 == 0) { System.out.println("Veiculo Isento"); } else {
		 * System.out.println("Valor do IPVA = " + ipvaC1); }
		 * 
		 * 
		 * if (ipvaC2 == 0) { System.out.println("Veiculo Isento de imposto"); } else {
		 * System.out.println("Valor do IPVA = " + ipvaC2); }
		 */
	}
}
