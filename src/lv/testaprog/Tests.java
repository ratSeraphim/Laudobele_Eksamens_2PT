package lv.testaprog;

import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		int x;
		/* do { */  String[] options = {"Pildīt testu", "Iziet no programmas"};
	      
	        x = JOptionPane.showOptionDialog(null, "Veic izvēli!",
	                null,
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	     switch(x) {
	     case 0: System.out.println("Vēl nav izveidota funkcionalitāte...");
	     new TestaJaut1();
			
	     break;
	  
	     case 1: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE); break;
	    	 
	     default: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE); 
	     	System.exit(0);
	    }
		/* }while(x != 1); */		
	}

}


