package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Trinnskatt {

	public static void main(String[] args) {

		String x = showInputDialog ("trinnskatt");
		int bruttoinntekt = Integer.parseInt(x);
		
		double sats= 0.00;
		if (bruttoinntekt >= 0 && bruttoinntekt <= 16410);
		
		sats= 0.93/100;
		if (bruttoinntekt >= 164101 && bruttoinntekt >=230950);
		
		sats= 2.41/100;
		if (bruttoinntekt >= 230951 && bruttoinntekt >= 580650);
		
		sats= 11.52/100;
		if (bruttoinntekt >= 580651 && bruttoinntekt >= 934050);
		
		sats= 14.52/100; 
		if (bruttoinntekt >= 934051);
		
		double Trinnskatt = bruttoinntekt * sats;
		showMessageDialog (null, "trinnskatten er" + Trinnskatt);	
		
	}

}
