package Components;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import Controller.Controllore;
import GUI.InserimentoCibo;
import GUI.InserimentoVisita;
import GUI.ViewVisite;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.Dimension;
public class PanelStatistiche extends JPanel{
	
	private Controllore controller;
	private JPanel panel_1;
	
	
	public PanelStatistiche(Controllore contr) {
		controller = contr;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1346, 728);
		add(panel);
		panel.setLayout(null);
		
		PanelCustomWhite sfondo = new PanelCustomWhite();
		sfondo.setForeground(new Color(0, 0, 0));
		sfondo.setBounds(-22, 22, 1021, 674);
		panel.add(sfondo);
		sfondo.setLayout(null);
		
		PanelCustomBlue panel_2 = new PanelCustomBlue();
		panel_2.setLayout(null);
		panel_2.setBounds(188, 555, 192, 94);
		sfondo.add(panel_2);
		
		JLabel label_tartarugheAccolte = new JLabel("TARTARUGHE ACCOLTE");
		label_tartarugheAccolte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//creo il dataSet
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				
				//aggiungo valori al dataSet
				dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2018), "Serie 1", "2018");
		        dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2019), "Serie 1", "2019");
		        dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2020), "Serie 1", "2020");
		        dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2021), "Serie 1", "2021");
		        dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2022), "Serie 1", "2022");
		        dataset.addValue(controller.eseguiFunzioneTartarugheAccolte(2023), "Serie 1", "2023");
				
				//creo il grafico
				JFreeChart jchart = ChartFactory.createBarChart3D("Tartarughe Accolte", "Anno", "Valore", dataset, PlotOrientation.VERTICAL, false, false, false);
				
				//creo pannello per il grafico
				ChartPanel chartPanel = new ChartPanel(jchart);
				chartPanel.setPreferredSize(new Dimension(900, 420));
				
				panel_1.removeAll();
				panel_1.add(chartPanel);
				panel_1.revalidate();
				panel_1.repaint();
				panel_1.updateUI();
			}
		});
		label_tartarugheAccolte.setForeground(Color.WHITE);
		label_tartarugheAccolte.setFont(new Font("SansSerif", Font.BOLD, 13));
		label_tartarugheAccolte.setBounds(10, 34, 182, 23);
		panel_2.add(label_tartarugheAccolte);
		
		PanelCustomBlue panel_3 = new PanelCustomBlue();
		panel_3.setLayout(null);
		panel_3.setBounds(390, 555, 192, 94);
		sfondo.add(panel_3);
		
		JLabel label_tartarugheRilasciate = new JLabel("TARTARUGHE RILASCIATE");
		label_tartarugheRilasciate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//creo il dataSet
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				
				//aggiungo valori al dataSet
				dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2018), "Serie 1", "2018");
		        dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2019), "Serie 1", "2019");
		        dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2020), "Serie 1", "2020");
		        dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2021), "Serie 1", "2021");
		        dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2022), "Serie 1", "2022");
		        dataset.addValue(controller.eseguiFunzioneTartarugheRilasciate(2023), "Serie 1", "2023");
				
				//creo il grafico
				JFreeChart jchart = ChartFactory.createBarChart3D("Tartarughe Rilasciate", "Anno", "Valore", dataset, PlotOrientation.VERTICAL, false, false, false);
				
				//creo pannello per il grafico
				ChartPanel chartPanel = new ChartPanel(jchart);
				chartPanel.setPreferredSize(new Dimension(900, 420));
				
				panel_1.removeAll();
				panel_1.add(chartPanel);
				panel_1.updateUI();
				
			}
		});
		label_tartarugheRilasciate.setForeground(Color.WHITE);
		label_tartarugheRilasciate.setFont(new Font("SansSerif", Font.BOLD, 13));
		label_tartarugheRilasciate.setBounds(10, 38, 182, 23);
		panel_3.add(label_tartarugheRilasciate);
		
		PanelCustomBlue panel_5 = new PanelCustomBlue();
		panel_5.setLayout(null);
		panel_5.setBounds(592, 555, 192, 94);
		sfondo.add(panel_5);
		
		JLabel label_tartarugheMorte = new JLabel("TARTARUGHE MORTE");
		label_tartarugheMorte.setBounds(21, 40, 161, 23);
		panel_5.add(label_tartarugheMorte);
		label_tartarugheMorte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//creo il dataSet
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				
				//aggiungo valori al dataSet
				dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2018), "Serie 1", "2018");
		        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2019), "Serie 1", "2019");
		        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2020), "Serie 1", "2020");
		        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2021), "Serie 1", "2021");
		        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2022), "Serie 1", "2022");
		        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2023), "Serie 1", "2023");
				
				//creo il grafico
				JFreeChart jchart = ChartFactory.createBarChart3D("Tartarughe Morte", "Anno", "Valore", dataset, PlotOrientation.VERTICAL, false, false, false);
				
				//creo pannello per il grafico
				ChartPanel chartPanel = new ChartPanel(jchart);
				chartPanel.setPreferredSize(new Dimension(900, 420));
				
				panel_1.removeAll();
				panel_1.add(chartPanel);
				panel_1.updateUI();
				
			}
		});
		label_tartarugheMorte.setForeground(new Color(255, 255, 255));
		label_tartarugheMorte.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		panel_1 = new JPanel();
		panel_1.setBounds(56, 93, 924, 430);
		sfondo.add(panel_1);
		
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		//aggiungo valori al dataSet
		dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2018), "Serie 1", "2018");
        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2019), "Serie 1", "2019");
        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2020), "Serie 1", "2020");
        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2021), "Serie 1", "2021");
        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2022), "Serie 1", "2022");
        dataset.addValue(controller.eseguiFunzioneTartarugheMorte(2023), "Serie 1", "2023");
		
		//creo il grafico
		JFreeChart jchart = ChartFactory.createBarChart3D("Tartarughe Morte", "Anno", "Valore", dataset, PlotOrientation.VERTICAL, false, false, false);
		
		//creo pannello per il grafico
		ChartPanel chartPanel = new ChartPanel(jchart);
		chartPanel.setPreferredSize(new Dimension(900, 420));
		
		panel_1.removeAll();
		panel_1.add(chartPanel);
		panel_1.updateUI();
		
		
		

	}
}
