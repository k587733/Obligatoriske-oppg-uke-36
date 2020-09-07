package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Poengsum {

	public static void main(String[] args) {
		String sum = showInputDialog ("poengsum");
		int poengsum = Integer.parseInt(sum);
		
		if (poengsum >= 0 && poengsum <=39) {
			showMessageDialog (null, "Karakter er F");
		}else if (poengsum >= 40 && poengsum <=49) {
			showMessageDialog (null, "Karakter er E");
		}else if (poengsum >= 50 && poengsum <=59) {
			showMessageDialog (null, "Karakter er D");
		}else if (poengsum >= 60 && poengsum <=79) {
			showMessageDialog (null, "Karakter er C");
		}else if (poengsum >= 80 && poengsum <= 89) {
			showMessageDialog (null, "Karakter er B");	
		}else if (poengsum >= 90 && poengsum <= 100) {
			showMessageDialog (null, "Karakter er A");
			}
		else {showMessageDialog(null, "Ugyldig, verdi"); } 
		
		
		
		
	}

}
