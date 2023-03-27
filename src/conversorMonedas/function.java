package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	MonedasAQuetzales quetzales = new MonedasAQuetzales();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Quetzales a Dólar", "De Quetzales a Euro", "De Quetzales a Libras","De Quetzales a Yen","De Quetzales a Won Coreano","De Dólar a Quetzales", "De Euro a Quetzales", "De Libras a Quetzales","De Yen a Quetzales","De Won Coreano a Quetzales"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Quetzales a Dólar":
        	monedas.ConvertirQuetzalesADolares(Minput);
        	break;
        case "De Quetzales a Euro":
        	monedas.ConvertirQuetzalesAEuros(Minput);
        	break;
        case "De Quetzales a Libras":
        	monedas.ConvertirQuetzalesALibras(Minput);
        	break;
        case "De Quetzales a Yen":
        	monedas.ConvertirQuetzalesAYen(Minput);
        	break;
        case "De Quetzales a Won Coreano":
        	monedas.ConvertirQuetzalesAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Quetzales":
        	quetzales.ConvertirDolaresAQuetzales(Minput);
        	break;
        case "De Euro a Quetzales":
        	quetzales.ConvertirEurosAQuetzales(Minput);
        	break;
        case "De Libras a Quetzales":
        	quetzales.ConvertirLibrasAQuetzales(Minput);
        	break;
        case "De Yen a Quetzales":
        	quetzales.ConvertirYenAQuetzales(Minput);
        	break;
        case "De Won Coreano a Quetzales":
        	quetzales.ConvertirWonAQuetzales(Minput);
            break;
        }      
    }
        
}