package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Rezultati {

	Rezultati(){
		//Izmanto boolean masīva vērtības lai iztulkotu nepareizi atbildētos jautājumus teksta masīvā 
		Tests.jautVerti();
		//Izveidots logs ar nosaukumu "1. Jautājums"
		final JFrame frame= new JFrame("Rezultāti");
		
		//Izraksta rezultātu
		final JPanel panel = new JPanel();
		 JTextArea textArea = new JTextArea(
	                "Tu pareizi atbildēji uz " +Tests.getParAtbSk()+" jautājumiem!\n" +
	                "Nepareizi atbildēji uz sekojošajiem jautājumiem: \n"+
	                		/*Izraksta visas teksta masīva vērtības, kurās ievietoti jautājumi,
	                		 *  uz kuriem atbildēts nepareizi*/
	                Tests.nepJaut(0)+
	                Tests.nepJaut(1)+
	                Tests.nepJaut(2)+
	                Tests.nepJaut(3)+
	                Tests.nepJaut(4)+
	                Tests.nepJaut(5)+
	                Tests.nepJaut(6)+
	                Tests.nepJaut(7)+
	                Tests.nepJaut(8)+
	                Tests.nepJaut(9)+
	                "", 
	                6, 
	                20);
	    
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true);
	        textArea.setOpaque(false);
	        textArea.setEditable(false);
	        
	        //Poga
	        JButton poga = new JButton("OK");
	        poga.setBounds(150, 300, 100, 30);
	        
	      //Pievienojam izveidotās sadaļas logam
	        panel.add(textArea);
	        frame.add(panel);
	        panel.add(poga);
	        frame.pack();
	        frame.setVisible(true);
	        frame.setSize(500,500); 
	        
	        //Kad nospiesta poga "OK",
	        poga.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	//Izbeidz programmu
	            	System.exit(0);
	            	
	            }
	        });
	}
}
