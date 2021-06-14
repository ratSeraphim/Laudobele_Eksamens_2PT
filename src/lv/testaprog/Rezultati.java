package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Rezultati {

	Rezultati(){
		Tests.jautVerti();
		
		JFrame frame= new JFrame("Rezultāti");
		
		final JPanel panel = new JPanel();
			//teksts
		System.out.println("Es izrakstu: \n"+Tests.nepJaut(2));
		 JTextArea textArea = new JTextArea(
	                "Tu pareizi atbildēji uz " +Tests.getParAtbSk()+" jautājumiem!\n" +
	                "Nepareizi atbildēji uz sekojošajiem jautājumiem: \n"+
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
	        
	        //poga
	        JButton poga = new JButton("OK");
	        poga.setBounds(150, 300, 100, 30);
	        
	        panel.add(textArea);
	        frame.add(panel);
	        panel.add(poga);
	        frame.pack();
	        frame.setVisible(true);
	        frame.setSize(500,500); 
	        
	        poga.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	frame.dispose();
	            	
	            }
	        });
	}
}
