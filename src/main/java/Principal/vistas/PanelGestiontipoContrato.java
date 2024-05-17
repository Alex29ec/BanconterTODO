package Principal.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Principal.Entidades.Contrato;
import Principal.Entidades.Tipocontrato;
import Principal.controlador.ControladorTipoContrato;
import Principal.controlador.DatosDeTabla;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class PanelGestiontipoContrato extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtffiltro;

	private DefaultTableModel dtm = null;

	private Object datosEnTabla[][] = DatosDeTabla.getDatosDeTabla();
	private String titulosEnTabla[] = DatosDeTabla.getTitulosColumnas();
	private JTable table;
	private static Tipocontrato tc;
	private JScrollPane scrollPane;
	 private Object[][] datosFiltrados;


	public PanelGestiontipoContrato() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 248, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblGestionTipoDe = new JLabel("Gestion Tipo de Contratos:");
		GridBagConstraints gbc_lblGestionTipoDe = new GridBagConstraints();
		gbc_lblGestionTipoDe.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionTipoDe.gridx = 0;
		gbc_lblGestionTipoDe.gridy = 0;
		panel.add(lblGestionTipoDe, gbc_lblGestionTipoDe);
		
		jtffiltro = new JTextField();
		jtffiltro.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				buscar();
			}
		});
		GridBagConstraints gbc_jtffiltro = new GridBagConstraints();
		gbc_jtffiltro.insets = new Insets(0, 0, 5, 0);
		gbc_jtffiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtffiltro.gridx = 0;
		gbc_jtffiltro.gridy = 1;
		panel.add(jtffiltro, gbc_jtffiltro);
		jtffiltro.setColumns(10);
		
		 scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		this.dtm = getDefaultTableModelNoEditable();
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
		
		JButton btnOk = new JButton("ok");
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cerrar();
			
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.gridx = 0;
		gbc_btnOk.gridy = 3;
		panel.add(btnOk, gbc_btnOk);
		table.addMouseListener(getMouseListener());
	}
	
	
	private void buscar() {
        List<Tipocontrato> e = (List<Tipocontrato>) ControladorTipoContrato.getInstance().
                findbyString(this.jtffiltro.getText().toLowerCase(), "tipocontrato");
        datosFiltrados = new Object[e.size()][2];
        for (int i = 0; i < e.size(); i++) {
            tc = e.get(i);
            datosFiltrados[i][0] = tc.getId();
            datosFiltrados[i][1] = tc.getDescripcion();
    } 
        dtm = new DefaultTableModel(datosFiltrados, titulosEnTabla);
        table = new JTable(dtm);
        table.addMouseListener(getMouseListener());
    table.setModel(dtm); 
    this.scrollPane.setViewportView(table);
    
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
	
	private MouseListener getMouseListener () {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if(jtffiltro.getText().isEmpty()) {
            		super.mouseClicked(e);
                    Object value = datosEnTabla[table.getSelectedRow()][0];
                    Tipocontrato toc = (Tipocontrato) ControladorTipoContrato.getInstance().find((int)value);
                    tc = toc;
            	}else {
            		
                super.mouseClicked(e);
                Object value = datosFiltrados[table.getSelectedRow()][0];
                Tipocontrato toc = (Tipocontrato) ControladorTipoContrato.getInstance().find((int)value);
                tc = toc;
            	}
            }
        };
    }

    
    public static void cerrar() {
    	JDialog midialogo = PanelPrincipal.getDialogo();
    	if(midialogo !=null) {
    		midialogo.dispose();
    	}
    }
    
    public static Tipocontrato getTc(Contrato c) {
		if(tc !=null) {
			return tc;
		}
		else {
			System.out.println("tc es null");
		}
		return null;
	}
}
