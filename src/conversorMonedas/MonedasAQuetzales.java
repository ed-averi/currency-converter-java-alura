package conversorMonedas;

import javax.swing.JOptionPane;

public class MonedasAQuetzales {
	public void ConvertirDolaresAQuetzales(double valor) {
		double monedaDolar = valor * 7.81;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaDolar+ " Quetzales");
	}
	
	public void ConvertirEurosAQuetzales(double valor) {
		double monedaEuro = valor * 8.42;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes Q " +monedaEuro+ " Quetzales");
	}
	
	public void ConvertirLibrasAQuetzales(double valor) {
		double monedaLibra = valor * 9.56;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaLibra+ " Quetzales");
	}
	
	public void ConvertirYenAQuetzales(double valor) {
		double monedaYen = valor * 0.060;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaYen+ " Quetzales");
	}
	
	public void ConvertirWonAQuetzales(double valor) {
		double monedaWon = valor * 0.0060;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaWon+ " Quetzales");
	}
}