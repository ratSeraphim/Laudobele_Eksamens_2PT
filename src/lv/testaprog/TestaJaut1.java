package lv.testaprog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestaJaut1 extends Tests {

	double parAtb=0; 
	boolean nepareiziAtbildets = true;
	
	TestaJaut1(){
		JFrame frame= new JFrame("1. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("1. Kad izmanto ciklu ar skaitītāju?");  
	    jaut.setBounds(10, 50, 300, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("Kad ir zināms cik reizes vajag veikt darbību");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("Kad nav zināms cik reizes vajag veikt darbību");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("Kad vajag veikt vienreizēju darbību");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("Kad nepieciešams veikt darbību vairākas reizes");
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
            		parAtb = parAtb-0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	
            	if(parAtb == 1) {
            		
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            		
            		Tests.atbPareizi();
                	
                	System.out.println("Pareizo atbilzu skaits ir "+Tests.getParAtbSk()+"!");
            	} else {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            	frame.dispose();
            	
            	new TestaJaut2();
            	
            }
        });
        
	}
	
	
	
	
	
/*	public void TestaJaut7(){
		JFrame frame= new JFrame("7. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("7. Kādus mainīgā nosaukumus pieņemts izmantot ārējam un iekšējam skaitītājam taisot ciklu ciklā?");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("i");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("skaititajs1");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("a");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("j");
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
            		parAtb = parAtb-0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	
            	if(parAtb == 1) {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	} else {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            	frame.dispose();
            	TestaJaut8();
            }
        });
        
	}
	
	public void TestaJaut8(){
		JFrame frame= new JFrame("8. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("8. Izvēlies patiesus apgalvojumus par skaitītāju!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("Skaitītāju jāsauc ‘i’, jo tāds nosaukums iebūvēts javā");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("Skaitītāju var saukt kā vēlas, ‘i’ ir tikai pieņemtais nosaukums");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("Lai programma darbotos bez kļūdām, skaitītājam jābūt veselam skaitlim");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("Skaitītājs var būt jebkurš datu tips un programma darbosies bez kļūdām");
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
            		parAtb = parAtb-0.5;
            	}
            	if(ch_2atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb+0.5;
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
            	TestaJaut9();
            }
        });
        
	}
	
	public void TestaJaut9(){
		JFrame frame= new JFrame("9. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("9. Izvēlies patiesus apgalvojumus par ciklu ciklā!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("Iekšējais cikls un ārējais cikls darbojas neatkarīgi viens no otra");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("Iekšējais cikls atkārtojas līdz ārējais cikls ir beidzis darbību");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("Iekšējais un ārējais cikls var izmantot vienādus cikla skaitītāja nosaukumus");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("Iekšējā cikla skaitītājs un ārējā cikla skaitītājs nevar izmantot vienādus nosaukumus");
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
            		parAtb = parAtb-0.5;
            	}
            	if(ch_2atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	if(ch_3atb.isSelected()) {
            		parAtb = parAtb-0.5;
            	}
      
            	if(ch_4atb.isSelected()) {
            		parAtb = parAtb+0.5;
            	}
            	
            	if(parAtb == 1) {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	} else {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            	frame.dispose();
            	TestaJaut10();
            }
        });
        
	}
	
	public void TestaJaut10(){
		JFrame frame= new JFrame("10. Jautājums");
		
		//Jautājums
		JLabel jaut;  
	    jaut=new JLabel("10. Izvēlies patiesus apgalvojumus par skaitītāja soli!");  
	    jaut.setBounds(10, 50, 350, 30);  
	    
	    //Atbildes
		JCheckBox ch_1atb = new JCheckBox("Skaitītāja soļa darbība var būt tikai saskaitīšana vai atņemšana");
		ch_1atb.setBounds(50, 100, 300, 50);
		JCheckBox ch_2atb = new JCheckBox("Skaitītāja soļa darbībā nevar izmantot saīsinātus pierakstus");
		ch_2atb.setBounds(50, 150, 300, 50);
		JCheckBox ch_3atb = new JCheckBox("Nepareizi pierakstīts skaitītāja solis var izjaukt visa cikla darbību");
		ch_3atb.setBounds(50, 200, 300, 50);
		JCheckBox ch_4atb = new JCheckBox("Skaititāja solim var izmantot jebkuru matemātisko darbību");
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
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir pareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	} else {
            		JOptionPane.showMessageDialog(null, "Tava atbilde ir nepareiza!", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
            	}
            	
            	frame.dispose();
            	//Rezultati();
            }
        });
        
	} */
}
