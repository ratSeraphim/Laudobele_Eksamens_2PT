package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestaJaut3 {

	double parAtb=0; 
	boolean nepareiziAtbildets = true;
	
	TestaJaut3(){
		parAtb=0; 
		final JFrame frame= new JFrame("3. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("3. Izvēlies iespējamus beigu nosacījumus!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		final JCheckBox ch_1atb = new JCheckBox("a) i = 5");
		ch_1atb.setBounds(50, 100, 300, 50);
		final JCheckBox ch_2atb = new JCheckBox("b) i <= 5");
		ch_2atb.setBounds(50, 150, 300, 50);
		final JCheckBox ch_3atb = new JCheckBox("c) i < -5");
		ch_3atb.setBounds(50, 200, 300, 50);
		final JCheckBox ch_4atb = new JCheckBox("d) i > 5");
		ch_4atb.setBounds(50, 250, 300, 50);
		
		//Poga
		JButton poga = new JButton("Atbildēt");
        poga.setBounds(150, 300, 100, 30);
       
      
		//Logs
        frame.add(poga);
		frame.add(jaut);
		frame.add(ch_1atb);  
		frame.add(ch_2atb);  
		frame.add(ch_3atb);  
		frame.add(ch_4atb);  
        frame.setSize(600,500);  
        frame.setLayout(null);  
        frame.setVisible(true);
        
        //Loga funckionalitātes (atbildes)
        poga.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(ch_1atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
            	if(ch_2atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	
            	if(parAtb == 1.5) {
            		Tests.atbRezultats(true, 2);
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		Tests.atbPareizi();
                	
                	System.out.println("3. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
                	
            	} else {
            		Tests.atbRezultats(false, 2);
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		System.out.println("3. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            		
            	}
            	
            	
            	frame.dispose();
            	new TestaJaut4();
            }
        });
        
	}
}
