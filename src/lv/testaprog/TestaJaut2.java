package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestaJaut2 {

	double parAtb=0; 
	boolean nepareiziAtbildets = true;
	
	TestaJaut2(){
		JFrame frame= new JFrame("2. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("2. Atlasi tos variantus, kurus var izmantot cikla ar skaitītāja sākumam");  
	    jaut.setBounds(10, 50, 500, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("int i = 0");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("int i = -3");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("int i = 4.5");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("int i = k");
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
        frame.setSize(500,500);  
        frame.setLayout(null);  
        frame.setVisible(true);
        
        //Loga funckionalitātes (atbildes)
        poga.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(ch_1atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	if(ch_2atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
            	
            	if(parAtb == 1) {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	} else {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            	frame.dispose();
            	new TestaJaut3();
            }
        });
        
	}
}
