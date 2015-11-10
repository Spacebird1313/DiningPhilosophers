import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class ExperimentGUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private Tafel tafel;
	final Image ExperimentImage = Toolkit.getDefaultToolkit().getImage("Pictures/GevuldeTafel.png");
	final Image DenkFil1 = Toolkit.getDefaultToolkit().getImage("Pictures/DenkFil1.png");
	final Image DenkFil2 = Toolkit.getDefaultToolkit().getImage("Pictures/DenkFil2.png");
	final Image DenkFil3 = Toolkit.getDefaultToolkit().getImage("Pictures/DenkFil3.png");
	final Image DenkFil4 = Toolkit.getDefaultToolkit().getImage("Pictures/DenkFil4.png");
	final Image DenkFil5 = Toolkit.getDefaultToolkit().getImage("Pictures/DenkFil5.png");
	final Image EetFil1 = Toolkit.getDefaultToolkit().getImage("Pictures/EetFil1.png");
	final Image EetFil2 = Toolkit.getDefaultToolkit().getImage("Pictures/EetFil2.png");
	final Image EetFil3 = Toolkit.getDefaultToolkit().getImage("Pictures/EetFil3.png");
	final Image EetFil4 = Toolkit.getDefaultToolkit().getImage("Pictures/EetFil4.png");
	final Image EetFil5 = Toolkit.getDefaultToolkit().getImage("Pictures/EetFil5.png");
	private JPanel denktankPanel, tafelPanel;
	private JButton startExperimentButton, deadlockModeButton;
	private JLabel nummer1, nummer2, nummer3, nummer4, nummer5, denkBallon1, denkBallon2, denkBallon3, denkBallon4, denkBallon5;
	private JLabel denkFil1, denkFil2, denkFil3, denkFil4, denkFil5;
	private JLabel tafelIm, eetFil1, eetFil2, eetFil3, eetFil4, eetFil5, vork1, vork2, vork3, vork4, vork5;
	private JLabel spaghetti1, spaghetti2, spaghetti3, spaghetti4, spaghetti5;
	private JLabel vorkLFil1, vorkRFil1, vorkLFil2, vorkRFil2, vorkLFil3, vorkRFil3, vorkLFil4, vorkRFil4, vorkLFil5, vorkRFil5;
	
	public ExperimentGUI()
	{
		this.setLayout(null);
		
		Font font = new Font("Arial", Font.PLAIN, 20);
		Font fontKlein = new Font("Arial", Font.PLAIN, 16);
		
		denktankPanel = new JPanel();
		denktankPanel.setBorder(BorderFactory.createTitledBorder("Denktank"));
		denktankPanel.setBounds(12, 12, 391, 544);
		denktankPanel.setLayout(null);
		
		tafelPanel = new JPanel();
		tafelPanel.setBorder(BorderFactory.createTitledBorder("Tafel"));
		tafelPanel.setBounds(409, 12, 675, 544);
		tafelPanel.setLayout(null);
		
		startExperimentButton = new JButton("Start experiment");
		startExperimentButton.setFont(font);
		startExperimentButton.setBackground(Color.lightGray);
		startExperimentButton.setBounds(159, 562, 368, 73);
		
		deadlockModeButton = new JButton("Deadlock mode");
		deadlockModeButton.setFont(font);
		deadlockModeButton.setBackground(Color.lightGray);
		deadlockModeButton.setBounds(550, 562, 368, 73);
		
		nummer1 = new JLabel("1");
		nummer1.setFont(font);
		nummer1.setBounds(17, 70, 22, 25);
		
		nummer2 = new JLabel("2");
		nummer2.setFont(font);
		nummer2.setBounds(17, 166, 22, 25);
		
		nummer3 = new JLabel("3");
		nummer3.setFont(font);
		nummer3.setBounds(17, 261, 22, 25);
		
		nummer4 = new JLabel("4");
		nummer4.setFont(font);
		nummer4.setBounds(17, 357, 22, 25);
		
		nummer5 = new JLabel("5");
		nummer5.setFont(font);
		nummer5.setBounds(17, 455, 22, 25);
		
		denkBallon1 = new JLabel("Hallo, ik ben John.");
		denkBallon1.setFont(fontKlein);
		denkBallon1.setBounds(187, 70, 195, 23);
		
		denkBallon2 = new JLabel("Ik ruik spaghetti.");
		denkBallon2.setFont(fontKlein);
		denkBallon2.setBounds(187, 166, 195, 23);
		
		denkBallon3 = new JLabel("Is het eten nog niet gereed?");
		denkBallon3.setFont(fontKlein);
		denkBallon3.setBounds(187, 258, 195, 23);
		
		denkBallon4 = new JLabel("Zzz...");
		denkBallon4.setFont(fontKlein);
		denkBallon4.setBounds(187, 357, 195, 23);
		
		denkBallon5 = new JLabel("Laten we beginnen!");
		denkBallon5.setFont(fontKlein);
		denkBallon5.setBounds(187, 455, 195, 23);
		
		denkFil1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/DenkFil1.png").getImage().getScaledInstance(136, 84, Image.SCALE_SMOOTH))));
		denkFil1.setBounds(45, 40, 136, 84);
		
		denkFil2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/DenkFil2.png").getImage().getScaledInstance(136, 84, Image.SCALE_SMOOTH))));
		denkFil2.setBounds(45, 136, 136, 84);
		
		denkFil3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/DenkFil3.png").getImage().getScaledInstance(136, 84, Image.SCALE_SMOOTH))));
		denkFil3.setBounds(45, 231, 136, 84);
		
		denkFil4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/DenkFil4.png").getImage().getScaledInstance(136, 84, Image.SCALE_SMOOTH))));
		denkFil4.setBounds(45, 327, 136, 84);
		
		denkFil5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/DenkFil5.png").getImage().getScaledInstance(136, 84, Image.SCALE_SMOOTH))));
		denkFil5.setBounds(45, 425, 136, 84);
		
		tafelIm = new JLabel(new ImageIcon((new ImageIcon("Pictures/Tafel.png").getImage().getScaledInstance(607, 486, Image.SCALE_SMOOTH))));
		tafelIm.setBounds(28, 28, 607, 486);
		
		eetFil1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/EetFil1.png").getImage().getScaledInstance(152, 95, Image.SCALE_SMOOTH))));
		eetFil1.setBounds(94, 29, 152, 95);
		eetFil1.setVisible(false);
		
		eetFil2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/EetFil2.png").getImage().getScaledInstance(133, 112, Image.SCALE_SMOOTH))));
		eetFil2.setBounds(417, 29, 133, 112);
		eetFil2.setVisible(false);

		eetFil3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/EetFil3.png").getImage().getScaledInstance(104, 146, Image.SCALE_SMOOTH))));
		eetFil3.setBounds(516, 250, 104, 146);
		eetFil3.setVisible(false);
		
		eetFil4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/EetFil4.png").getImage().getScaledInstance(160, 101, Image.SCALE_SMOOTH))));
		eetFil4.setBounds(248, 413, 160, 101);
		eetFil4.setVisible(false);
		
		eetFil5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/EetFil5.png").getImage().getScaledInstance(101, 149, Image.SCALE_SMOOTH))));
		eetFil5.setBounds(38, 243, 101, 149);
		eetFil5.setVisible(false);
		
		spaghetti1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/spaghetti.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		spaghetti1.setBounds(200, 114, 63, 60);
		spaghetti1.setVisible(false);
		
		spaghetti2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/spaghetti.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		spaghetti2.setBounds(385, 114, 63, 60);
		spaghetti2.setVisible(false);
		
		spaghetti3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/spaghetti.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		spaghetti3.setBounds(432, 255, 63, 60);
		spaghetti3.setVisible(false);
		
		spaghetti4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/spaghetti.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		spaghetti4.setBounds(292, 342, 63, 60);
		spaghetti4.setVisible(false);
		
		spaghetti5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/spaghetti.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		spaghetti5.setBounds(147,255, 63, 60);
		spaghetti5.setVisible(false);
		
		vork1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork1.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vork1.setBounds(165, 149, 63, 60);
		
		vork2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork2.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vork2.setBounds(332, 81, 63, 60);
		
		vork3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork3.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vork3.setBounds(462, 211, 63, 60);
		
		vork4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork4.png").getImage().getScaledInstance(14, 72, Image.SCALE_SMOOTH))));
		vork4.setBounds(378, 334, 14, 72);
		
		vork5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork5.png").getImage().getScaledInstance(65, 45, Image.SCALE_SMOOTH))));
		vork5.setBounds(183, 303, 65, 45);
		
		vorkLFil1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork1.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkLFil1.setBounds(206, 28, 63, 60);
		vorkLFil1.setVisible(false);
		
		vorkRFil1 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork1.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkRFil1.setBounds(101, 92, 63, 60);
		vorkRFil1.setVisible(false);
		
		vorkLFil2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork2.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkLFil2.setBounds(482, 111, 63, 60);
		vorkLFil2.setVisible(false);
		
		vorkRFil2 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork2.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkRFil2.setBounds(385, 30, 63, 60);
		vorkRFil2.setVisible(false);
		
		vorkLFil3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork3.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkLFil3.setBounds(490, 335, 63, 60);
		vorkLFil3.setVisible(false);
		
		vorkRFil3 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork3.png").getImage().getScaledInstance(63, 60, Image.SCALE_SMOOTH))));
		vorkRFil3.setBounds(549, 228, 63, 60);
		vorkRFil3.setVisible(false);
		
		vorkLFil4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork4.png").getImage().getScaledInstance(14, 72, Image.SCALE_SMOOTH))));
		vorkLFil4.setBounds(262, 413, 14, 72);
		vorkLFil4.setVisible(false);
		
		vorkRFil4 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork4.png").getImage().getScaledInstance(14, 72, Image.SCALE_SMOOTH))));
		vorkRFil4.setBounds(381, 413, 14, 72);
		vorkRFil4.setVisible(false);
		
		vorkLFil5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork5.png").getImage().getScaledInstance(65, 45, Image.SCALE_SMOOTH))));
		vorkLFil5.setBounds(48, 234, 65, 45);
		vorkLFil5.setVisible(false);
		
		vorkRFil5 = new JLabel(new ImageIcon((new ImageIcon("Pictures/Vork5.png").getImage().getScaledInstance(65, 45, Image.SCALE_SMOOTH))));
		vorkRFil5.setBounds(105, 339, 65, 45);
		vorkRFil5.setVisible(false);
		
		//Set GUI
		this.add(denktankPanel);
		this.add(tafelPanel);
		this.add(startExperimentButton);
		this.add(deadlockModeButton);
		
		denktankPanel.add(nummer1);
		denktankPanel.add(nummer2);
		denktankPanel.add(nummer3);
		denktankPanel.add(nummer4);
		denktankPanel.add(nummer5);
		denktankPanel.add(denkBallon1);
		denktankPanel.add(denkBallon2);
		denktankPanel.add(denkBallon3);
		denktankPanel.add(denkBallon4);
		denktankPanel.add(denkBallon5);
		denktankPanel.add(denkFil1);
		denktankPanel.add(denkFil2);
		denktankPanel.add(denkFil3);
		denktankPanel.add(denkFil4);
		denktankPanel.add(denkFil5);
		
		tafelPanel.add(vorkLFil1);
		tafelPanel.add(vorkRFil1);
		tafelPanel.add(vorkLFil2);
		tafelPanel.add(vorkRFil2);
		tafelPanel.add(vorkLFil3);
		tafelPanel.add(vorkRFil3);
		tafelPanel.add(vorkLFil4);
		tafelPanel.add(vorkRFil4);
		tafelPanel.add(vorkLFil5);
		tafelPanel.add(vorkRFil5);
		tafelPanel.add(eetFil1);
		tafelPanel.add(eetFil2);
		tafelPanel.add(eetFil3);
		tafelPanel.add(eetFil4);
		tafelPanel.add(eetFil5);
		tafelPanel.add(spaghetti1);
		tafelPanel.add(spaghetti2);
		tafelPanel.add(spaghetti3);
		tafelPanel.add(spaghetti4);
		tafelPanel.add(spaghetti5);
		tafelPanel.add(vork1);
		tafelPanel.add(vork2);
		tafelPanel.add(vork3);
		tafelPanel.add(vork4);
		tafelPanel.add(vork5);
		tafelPanel.add(tafelIm);
		
		//Actionlisteners
		startExperimentButton.addActionListener(this);
		deadlockModeButton.addActionListener(this);
		
		this.GUIinitialiseren();
		this.setVisible(true);
	}
	
	private void GUIinitialiseren()
	{
		this.setTitle("Dining Philosophers Problem - Thomas Huybrechts 2014");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(ExperimentImage);
		this.setSize(1115, 685);
		this.setResizable(false);
	}
	
	private void tafelInitialiseren()
	{
		//filosoofobservers initialiseren
		//filosoof 1
		this.tafel.observerableOpvragen(0).addObserver(new Observer()
		{
			public void update(Observable source, Object object)
			{
				filosoofToestandGewijzigd(object, 0);
			}
		});
		//filosoof 2
		this.tafel.observerableOpvragen(1).addObserver(new Observer()
		{
			public void update(Observable source, Object object)
			{
				filosoofToestandGewijzigd(object, 1);
			}
		});
		//filosoof 3
		this.tafel.observerableOpvragen(2).addObserver(new Observer()
		{
			public void update(Observable source, Object object)
			{
				filosoofToestandGewijzigd(object, 2);
			}
		});
		//filosoof 4
		this.tafel.observerableOpvragen(3).addObserver(new Observer()
		{
			public void update(Observable source, Object object)
			{
				filosoofToestandGewijzigd(object, 3);
			}
		});
		//filosoof 5
		this.tafel.observerableOpvragen(4).addObserver(new Observer()
		{
			public void update(Observable source, Object object)
			{
				filosoofToestandGewijzigd(object, 4);
			}
		});
	}
	
	private void filosoofToestandGewijzigd(Object object, int filosoofNummer)
	{
		switch((String) object)
		{
			case "denken":
				zetTekstballon(filosoofNummer, "Aan het denken...");
				break;
			case "eten":
				zetTekstballon(filosoofNummer, "Hmmm spaghetti...");
				filosoofEten(filosoofNummer);
				break;
			case "wachtPlaats":
				zetTekstballon(filosoofNummer, "Honger... Is er plaats?");
				break;
			case "neemPlaats":
				filosoofPlaatsen(filosoofNummer);
				break;
			case "plaatsVrij":
				filosoofVerwijderen(filosoofNummer);
				break;
			case "wachtRVork":
				zetTekstballon(filosoofNummer, "Waar is mijn rechtervork?");
				break;
			case "wachtLVork":
				zetTekstballon(filosoofNummer, "Waar is mijn linkervork?");
				break;
			case "neemRVork":
				neemVork(filosoofNummer, "rechts");
				break;
			case "neemLVork":
				neemVork(filosoofNummer, "links");
				break;
			case "LVorkVrij":
				terugleggenVork(filosoofNummer, "links");
				break;
			case "RVorkVrij":
				terugleggenVork(filosoofNummer, "rechts");
				break;
		}
			
	}
	
	private void zetTekstballon(int nummer, String tekst)
	{
		switch(nummer)
		{
			case 0:
				denkBallon1.setText(tekst);
				break;
			case 1:
				denkBallon2.setText(tekst);
				break;
			case 2:
				denkBallon3.setText(tekst);
				break;
			case 3:
				denkBallon4.setText(tekst);
				break;
			case 4:
				denkBallon5.setText(tekst);
				break;
		}
	}
	
	private void filosoofPlaatsen(int nummer)
	{
		switch(nummer)
		{
			case 0:
				eetFil1.setVisible(true);
				break;
			case 1:
				eetFil2.setVisible(true);
				break;
			case 2:
				eetFil3.setVisible(true);
				break;
			case 3:
				eetFil4.setVisible(true);
				break;
			case 4:
				eetFil5.setVisible(true);
				break;
		}
	}
	
	private void filosoofVerwijderen(int nummer)
	{
		switch(nummer)
		{
			case 0:
				eetFil1.setVisible(false);
				spaghetti1.setVisible(false);
				break;
			case 1:
				eetFil2.setVisible(false);
				spaghetti2.setVisible(false);
				break;
			case 2:
				eetFil3.setVisible(false);
				spaghetti3.setVisible(false);
				break;
			case 3:
				eetFil4.setVisible(false);
				spaghetti4.setVisible(false);
				break;
			case 4:
				eetFil5.setVisible(false);
				spaghetti5.setVisible(false);
				break;
		}
	}
	
	private void filosoofEten(int nummer)
	{
		switch(nummer)
		{
			case 0:
				spaghetti1.setVisible(true);
				break;
			case 1:
				spaghetti2.setVisible(true);
				break;
			case 2:
				spaghetti3.setVisible(true);
				break;
			case 3:
				spaghetti4.setVisible(true);
				break;
			case 4:
				spaghetti5.setVisible(true);
				break;
		}
	}
	
	private void neemVork(int nummer, String kant)
	{
		int vork;
		if(kant.equals("links"))
		{
			vork = (nummer + 1) % tafel.aantalVorken();
			switch(nummer)
			{
				case 0:
					vorkLFil1.setVisible(true);
					break;
				case 1:
					vorkLFil2.setVisible(true);
					break;
				case 2:
					vorkLFil3.setVisible(true);
					break;
				case 3:
					vorkLFil4.setVisible(true);
					break;
				case 4:
					vorkLFil5.setVisible(true);
					break;
			}
		}
		else
		{
			vork = nummer;
			switch(nummer)
			{
				case 0:
					vorkRFil1.setVisible(true);
					break;
				case 1:
					vorkRFil2.setVisible(true);
					break;
				case 2:
					vorkRFil3.setVisible(true);
					break;
				case 3:
					vorkRFil4.setVisible(true);
					break;
				case 4:
					vorkRFil5.setVisible(true);
					break;
			}
		}
		
		switch(vork)
		{
			case 0:
				vork1.setVisible(false);
				break;
			case 1:
				vork2.setVisible(false);
				break;
			case 2:
				vork3.setVisible(false);
				break;
			case 3:
				vork4.setVisible(false);
				break;
			case 4:
				vork5.setVisible(false);
				break;
		}
	}
	
	private void terugleggenVork(int nummer, String kant)
	{
		int vork;
		if(kant.equals("links"))
		{
			vork = (nummer + 1) % tafel.aantalVorken();
			switch(nummer)
			{
				case 0:
					vorkLFil1.setVisible(false);
					break;
				case 1:
					vorkLFil2.setVisible(false);
					break;
				case 2:
					vorkLFil3.setVisible(false);
					break;
				case 3:
					vorkLFil4.setVisible(false);
					break;
				case 4:
					vorkLFil5.setVisible(false);
					break;
			}
		}
		else
		{
			vork = nummer;
			switch(nummer)
			{
				case 0:
					vorkRFil1.setVisible(false);
					break;
				case 1:
					vorkRFil2.setVisible(false);
					break;
				case 2:
					vorkRFil3.setVisible(false);
					break;
				case 3:
					vorkRFil4.setVisible(false);
					break;
				case 4:
					vorkRFil5.setVisible(false);
					break;
			}
		}
		
		switch(vork)
		{
			case 0:
				vork1.setVisible(true);
				break;
			case 1:
				vork2.setVisible(true);
				break;
			case 2:
				vork3.setVisible(true);
				break;
			case 3:
				vork4.setVisible(true);
				break;
			case 4:
				vork5.setVisible(true);
				break;
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton)e.getSource();
		if(b == startExperimentButton)
		{
			this.tafel = new Tafel(5, false);
			tafelInitialiseren();
			tafel.etenstijd();
			startExperimentButton.setEnabled(false);
			deadlockModeButton.setEnabled(false);
		}
		else if(b == deadlockModeButton)
		{
			this.tafel = new Tafel(5, true);
			tafelInitialiseren();
			tafel.etenstijd();
			startExperimentButton.setEnabled(false);
			deadlockModeButton.setEnabled(false);
		}
	}
}
