package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirQuetzalesADolares(double valor) {
		double monedaDolar = valor / 7.81;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirQuetzalesAEuros(double valor) {
		double monedaEuro = valor / 8.42;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes € " +monedaEuro+ " Euros");
	}
	
	public void ConvertirQuetzalesALibras(double valor) {
		double monedaLibra = valor / 9.56;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes £ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirQuetzalesAYen(double valor) {
		double monedaYen = valor / 16.74;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ¥‎ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirQuetzalesAWon(double valor) {
		double monedaWon = valor / 166.02;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " +monedaWon+ " Wons");
	}
}