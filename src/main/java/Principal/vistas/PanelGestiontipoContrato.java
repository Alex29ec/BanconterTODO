package Principal.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Principal.controlador.DatosDeTabla;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelGestiontipoContrato extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtffiltro;

	private DefaultTableModel dtm = null;

	private Object datosEnTabla[][] = DatosDeTabla.getDatosDeTabla();
	private String titulosEnTabla[] = DatosDeTabla.getTitulosColumnas();
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
		this.dtm = getDefaultTableModelNoEditable();
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int indiceFilaSel = table.getSelectedRow();		
				Object value = datosEnTabla[indiceFilaSel][0];
			}
		});
	}
	private DefaultTableModel getDefaultTableModelNoEditable () {
		DefaultTableModel dtm = new DefaultTableModel(datosEnTabla, titulosEnTabla) {
			
			/**
			 * La sobreescritura de este método nos permite controlar qué celdas queremos que sean editables
			 */
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column != 1) {
					return false;
				}
				return true;
			}
		};
		return dtm;
	}

}
