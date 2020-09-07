package no.hvl.dat100;

import javax.swing.JOptionPane;
public class Fakultet {

	public static void main(String[] args) {
		

		  int faktorVerdi;
		  String verdi;
		  int faktor = 1;
		  
		  verdi= JOptionPane.showInputDialog("sett inn faktor verdi");
		  faktorVerdi = Integer.parseInt(verdi);
		  
		  for (int i = faktor;  i <= faktorVerdi; i++) {	
		      faktor = faktor * (i);
		      
		  }
		  
		  System.out.println("Fakultet av " + faktorVerdi + " er " + faktor);
		    }

		}
