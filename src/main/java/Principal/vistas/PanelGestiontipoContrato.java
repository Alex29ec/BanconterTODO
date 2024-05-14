package Principal.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelGestiontipoContrato extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtffiltro;
	private JTable table;

	public PanelGestiontipoContrato() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 248, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblGestionTipoDe = new JLabel("Gestion Tipo de Contratos:");
		GridBagConstraints gbc_lblGestionTipoDe = new GridBagConstraints();
		gbc_lblGestionTipoDe.gridwidth = 2;
		gbc_lblGestionTipoDe.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionTipoDe.gridx = 0;
		gbc_lblGestionTipoDe.gridy = 0;
		panel.add(lblGestionTipoDe, gbc_lblGestionTipoDe);
		
		jtffiltro = new JTextField();
		GridBagConstraints gbc_jtffiltro = new GridBagConstraints();
		gbc_jtffiltro.insets = new Insets(0, 0, 5, 5);
		gbc_jtffiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtffiltro.gridx = 0;
		gbc_jtffiltro.gridy = 1;
		panel.add(jtffiltro, gbc_jtffiltro);
		jtffiltro.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
