package lv.testaprog;

import javax.swing.JOptionPane;

public class Tests {
	
	static int parAtbSk = 0;
	
	static void atbPareizi() {
		parAtbSk++;
		
	}
	static int getParAtbSk() {
		return parAtbSk;
	}
	
	/*public Tests(int pas) {
		this.parAtbSk = pas;
	}

	public void setparAtbSk(int x) {
		this.parAtbSk = parAtbSk + x;
	}*/
	
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


