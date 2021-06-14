package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestaJaut10 {
	
	//Izmantots lai skaitītu punktus līdz "pareizai atbildei"
	double parAtb=0; 

	
	TestaJaut10(){
		//Izveidots logs ar nosaukumu "1. Jautājums"
		final JFrame frame= new JFrame("10. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("10. Izvēlies patiesus apgalvojumus par skaitītāja soli!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes varianti
		final JCheckBox ch_1atb = new JCheckBox("a) Skaitītāja soļa darbība var būt tikai saskaitīšana vai atņemšana");
		ch_1atb.setBounds(50, 100, 400, 50);
		final JCheckBox ch_2atb = new JCheckBox("b) Skaitītāja soļa darbībā nevar izmantot saīsinātus pierakstus");
		ch_2atb.setBounds(50, 150, 400, 50);
		final JCheckBox ch_3atb = new JCheckBox("c) Nepareizi pierakstīts skaitītāja solis var izjaukt visa cikla darbību");
		ch_3atb.setBounds(50, 200, 500, 50);
		final JCheckBox ch_4atb = new JCheckBox("d) Skaititāja solim var izmantot jebkuru matemātisko darbību");
		ch_4atb.setBounds(50, 250, 400, 50);
		
		//Poga "Atbildēt"
		JButton poga = new JButton("Atbildēt");
        poga.setBounds(150, 300, 100, 30);
       
      
		//Pievienojam izveidotās sadaļas logam
        frame.add(poga);
		frame.add(jaut);
		frame.add(ch_1atb);  
		frame.add(ch_2atb);  
		frame.add(ch_3atb);  
		frame.add(ch_4atb);  
        frame.setSize(600,500);  
        frame.setLayout(null);  
        frame.setVisible(true);
        
        //Loga funckionalitātes (nospiesta atbildes poga)
        poga.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	/*Ja izvēlēts attiecīgi pareizais/nepareizais variants,
            	 * tiek doti vai atņemti punkti
            	 */
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
            	
            	//Ja lietotājs ir izvēlējies pareizās atbildes, punktu skaits ir 1
            	if(parAtb == 1) {
            		//Padod informāciju, ka šis jautājums atbildēts pareizi
            		Tests.atbRezultats(true, 9);
            		//Paziņo lietotājam par izvēlētās atbildes novērtējumu
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		//Pieskaita +1 pie pareizo atbilžu skaitītāja 
            		Tests.atbPareizi();
            		//Izraksta šī brīža pareizo atbilžu skaitu, lai atvieglotu atkļūdošanu
                	System.out.println("10. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            	} else {
            		//Padod informāciju, ka šis jautājums atbildēts nepareizi
            		Tests.atbRezultats(false, 9);
            		//Paziņo lietotājam par izvēlētās atbildes novērtējumu
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		//Izraksta šī brīža pareizo atbilžu skaitu, lai atvieglotu atkļūdošanu
            		System.out.println("10. Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            	}
            	
            	//Aizver 10. Jautājuma logu
            	frame.dispose();
            	//Lietotāju aizved uz rezultātu logu
            	new Rezultati();
            }
        });
        
	} 
}
