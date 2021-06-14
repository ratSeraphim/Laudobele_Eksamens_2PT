package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestaNoteik {

	TestaNoteik(){
		JFrame frame= new JFrame("Testa noteikumi");
		
		final JPanel panel = new JPanel();
			//teksts
		 JTextArea textArea = new JTextArea(
	                "Testā ir 10 jautājumi.\n " +
	                "Uz katru jautājumu ir 2 vai 3 pareizas atbildes.\n\n " +
	                "Pēc katra jautājuma uzzināsi, vai esi atbildējis " + 
	                "pareizi vai nē.\n Beigās uzzināsi uz cik jautājumiem "+
	                "esi atbildējis pareizi, un redzēsi jautājumus, uz "+
	                "kuriem atbildēji nepareizi.", 
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
	        frame.setSize(300,230); 
	        
	        poga.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	frame.dispose();
	            	new TestaJaut1();
	            	
	            }
	        });
	}
}
