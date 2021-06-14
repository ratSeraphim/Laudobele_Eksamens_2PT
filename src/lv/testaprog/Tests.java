package lv.testaprog;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Tests {
	
	static int parAtbSk = 0;
	static Boolean[] atbildes = new Boolean[10];
	static String[] jautajumi = new String[10];
	
	static void atbPareizi() {
		parAtbSk++;
		
	}
	static int getParAtbSk() {
		return parAtbSk;
	}
	
	
	
	static void atbRezultats(boolean x, int y) {
		 atbildes[y] = x;
		 System.out.println(atbildes[y]);
		}
	
	static void jautVerti() {
		for (int i = 0; i < atbildes.length; i++) {
			System.out.println(atbildes[i]);
		}
		for (int i = 0; i < atbildes.length; i++) {
			System.out.println(atbildes[i]);
			if(atbildes[i] == false) {
			switch(i) {
				case 0: jautajumi[i] = "1. Kad izmanto ciklu ar skaitītāju? \n"; break;
				case 1: jautajumi[i] = "2. Atlasi tos variantus, kurus var izmantot cikla ar skaitītāja sākumam \n"; break;
				case 2: jautajumi[i] = "3. Izvēlies iespējamus beigu nosacījumus! \n"; break;
				case 3: jautajumi[i] = "4. Kuri no šiem cikliem nodrošinās pozitīvu soli? \n"; break;
				case 4: jautajumi[i] = "5. Kurš no šiem cikliem pildīsies bezgalīgi? \n"; break;
				case 5: jautajumi[i] = "6. Kuros no šiem cikliem 3. solī skaitītāja vērtība būs 20? \n"; break;
				case 6: jautajumi[i] = "7. Kādus mainīgā nosaukumus pieņemts izmantot ārējam un iekšējam skaitītājam taisot ciklu ciklā? \n"; break;
				case 7: jautajumi[i] = "8. Izvēlies patiesus apgalvojumus par skaitītāju! \n"; break;
				case 8: jautajumi[i] = "9. Izvēlies patiesus apgalvojumus par ciklu ciklā! \n"; break;
				case 9: jautajumi[i] = "10. Izvēlies patiesus apgalvojumus par skaitītāja soli! \n"; break;
				}
	        } else{
	        	switch(i) {
				case 0: jautajumi[i] = ""; break;
				case 1: jautajumi[i] = ""; break;
				case 2: jautajumi[i] = ""; break;
				case 3: jautajumi[i] = ""; break;
				case 4: jautajumi[i] = ""; break;
				case 5: jautajumi[i] = ""; break;
				case 6: jautajumi[i] = ""; break;
				case 7: jautajumi[i] = ""; break;
				case 8: jautajumi[i] = ""; break;
				case 9: jautajumi[i] = ""; break;
				}
	        }
		}
		
		
	}
	
	static String nepJaut(int i) {
			return jautajumi[i];
	}
	
	public static void main(String[] args) {
		int x;
		/* do { */  String[] options = {"Pildīt testu", "Iziet no programmas"};
	      
	        x = JOptionPane.showOptionDialog(null, "Veic izvēli!",
	                null,
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	     switch(x) {
	     case 0: new TestaNoteik(); break;
	  
	     case 1: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE); break;
	    	 
	     default: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE); 
	     	System.exit(0);
	    }
		/* }while(x != 1); */		
	}

}


