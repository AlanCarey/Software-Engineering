
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.miginfocom.swing.MigLayout;


public class MyGUI{

	protected JTextArea displayText;
	protected JScrollPane displayTextSP;
	protected JButton open, reverse,clear;

	public MyGUI(){
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		
		JFrame frame = new JFrame();
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Text Editor"));
		frame.add(panel);

		panel.setLayout(new MigLayout("debug", "[]10[]10[]","[][][]"));

		open = new JButton("Open File");	
		clear = new JButton("Clear File");
		reverse = new JButton("Reverse");			
		JButton lab4 = new JButton("Label #4");
		JButton lab5 = new JButton("Label #5");			
		JButton lab6 = new JButton("Label #6");
		JButton lab7 = new JButton("Label #7");


		displayText = new JTextArea(30,30);
		//Scroll pane not working with mig layout
		displayTextSP = new JScrollPane(displayText);

		panel.add(open,"wrap");
		panel.add(clear);
		panel.add(displayTextSP);
		panel.add(reverse ,"wrap");
		panel.add(lab4, "wrap");
		panel.add(lab5);
		panel.add(lab6);
		panel.add(lab7);

		displayText.setLineWrap(true);






		frame.setVisible(true);
	}

}
