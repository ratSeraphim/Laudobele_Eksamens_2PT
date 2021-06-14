package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestaJaut10 {
	double parAtb=0; 
	boolean nepareiziAtbildets = true;

	
	TestaJaut10(){
		final JFrame frame= new JFrame("10. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("10. Izvēlies patiesus apgalvojumus par skaitītāja soli!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		final JCheckBox ch_1atb = new JCheckBox("a) Skaitītāja soļa darbība var būt tikai saskaitīšana vai atņemšana");
		ch_1atb.setBounds(50, 100, 400, 50);
		final JCheckBox ch_2atb = new JCheckBox("b) Skaitītāja soļa darbībā nevar izmantot saīsinātus pierakstus");
		ch_2atb.setBounds(50, 150, 400, 50);
		final JCheckBox ch_3atb = new JCheckBox("c) Nepareizi pierakstīts skaitītāja solis var izjaukt visa cikla darbību");
		ch_3atb.setBounds(50, 200, 500, 50);
		final JCheckBox ch_4atb = new JCheckBox("d) Skaititāja solim var izmantot jebkuru matemātisko darbību");
		ch_4atb.setBounds(50, 250, 400, 50);
		
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
            		parAtb = parAtb-0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	
            	if(parAtb == 1) {
            		Tests.atbRezultats(true, 9);
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		Tests.atbPareizi();
                	
                	System.out.println("10. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            	} else {
            		Tests.atbRezultats(false, 9);
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		System.out.println("10. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            	}
            	
            	frame.dispose();
            	new Rezultati();
            }
        });
        
	} 
}
