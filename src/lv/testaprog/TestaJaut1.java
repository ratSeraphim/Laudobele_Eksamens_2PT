package lv.testaprog;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestaJaut1 {

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
		
		
		//Logs
		frame.add(jaut);
		frame.add(ch_1atb);  
		frame.add(ch_2atb);  
		frame.add(ch_3atb);  
		frame.add(ch_4atb);  
        frame.setSize(500,500);  
        frame.setLayout(null);  
        frame.setVisible(true);
	}
}
