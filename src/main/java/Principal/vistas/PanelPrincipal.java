package Principal.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

import Principal.Entidades.Contrato;
import Principal.controlador.ControladorContrato;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfDescripcion;
	private JTextField jtftipoContrato;
	private JTextField Jtfusuario;
	private Contrato current;
	private JSlider jsliderSaldo;
	private JSpinner jspinnerlimite;
	private JFormattedTextField jftfecha;
	private JLabel labelsaldopuesto;
	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero();
			}
		});
		button.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/gotostart.png")));
		toolBar.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anterior();
			}
		});
		button_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/previous.png")));
		toolBar.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				siguiente();
			}
		});
		button_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/next.png")));
		toolBar.add(button_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ultimo();
			}
		});
		btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/gotoend.png")));
		toolBar.add(btnNewButton);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/nuevo.png")));
		toolBar.add(button_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/eliminar.png")));
		toolBar.add(btnNewButton_1);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/res/guardar.png")));
		toolBar.add(button_4);
		
		JPanel jtfusuario = new JPanel();
		add(jtfusuario, BorderLayout.CENTER);
		GridBagLayout gbl_jtfusuario = new GridBagLayout();
		gbl_jtfusuario.columnWidths = new int[]{0, 0, 0, 0};
		gbl_jtfusuario.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_jtfusuario.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_jtfusuario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jtfusuario.setLayout(gbl_jtfusuario);
		
		JLabel lblGestionContrato = new JLabel("Gestion Contrato");
		GridBagConstraints gbc_lblGestionContrato = new GridBagConstraints();
		gbc_lblGestionContrato.gridwidth = 3;
		gbc_lblGestionContrato.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionContrato.gridx = 0;
		gbc_lblGestionContrato.gridy = 0;
		jtfusuario.add(lblGestionContrato, gbc_lblGestionContrato);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 0;
		gbc_lblDescripcion.gridy = 1;
		jtfusuario.add(lblDescripcion, gbc_lblDescripcion);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.gridwidth = 2;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 1;
		jtfusuario.add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 2;
		jtfusuario.add(lblFecha, gbc_lblFecha);
		
		jftfecha = new JFormattedTextField();
		GridBagConstraints gbc_jftfecha = new GridBagConstraints();
		gbc_jftfecha.gridwidth = 2;
		gbc_jftfecha.insets = new Insets(0, 0, 5, 0);
		gbc_jftfecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jftfecha.gridx = 1;
		gbc_jftfecha.gridy = 2;
		jtfusuario.add(jftfecha, gbc_jftfecha);
		
		JLabel lblNewLabel = new JLabel("Limite:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		jtfusuario.add(lblNewLabel, gbc_lblNewLabel);
		
		jspinnerlimite = new JSpinner();
		GridBagConstraints gbc_jspinnerlimite = new GridBagConstraints();
		gbc_jspinnerlimite.gridwidth = 2;
		gbc_jspinnerlimite.insets = new Insets(0, 0, 5, 0);
		gbc_jspinnerlimite.gridx = 1;
		gbc_jspinnerlimite.gridy = 3;
		jtfusuario.add(jspinnerlimite, gbc_jspinnerlimite);
		
		JLabel lblSaldo = new JLabel("Saldo: ");
		GridBagConstraints gbc_lblSaldo = new GridBagConstraints();
		gbc_lblSaldo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaldo.gridx = 0;
		gbc_lblSaldo.gridy = 4;
		jtfusuario.add(lblSaldo, gbc_lblSaldo);
		
		jsliderSaldo = new JSlider();
		jsliderSaldo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				labelsaldopuesto.setText("Saldo: "+jsliderSaldo.getValue());
			}
		});
		GridBagConstraints gbc_jsliderSaldo = new GridBagConstraints();
		gbc_jsliderSaldo.insets = new Insets(0, 0, 5, 5);
		gbc_jsliderSaldo.gridx = 1;
		gbc_jsliderSaldo.gridy = 4;
		jtfusuario.add(jsliderSaldo, gbc_jsliderSaldo);
		
		labelsaldopuesto = new JLabel("");
		GridBagConstraints gbc_labelsaldopuesto = new GridBagConstraints();
		gbc_labelsaldopuesto.insets = new Insets(0, 0, 5, 0);
		gbc_labelsaldopuesto.gridx = 2;
		gbc_labelsaldopuesto.gridy = 4;
		jtfusuario.add(labelsaldopuesto, gbc_labelsaldopuesto);
		
		JLabel lblTipocontrato = new JLabel("TipoContrato: ");
		GridBagConstraints gbc_lblTipocontrato = new GridBagConstraints();
		gbc_lblTipocontrato.anchor = GridBagConstraints.EAST;
		gbc_lblTipocontrato.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipocontrato.gridx = 0;
		gbc_lblTipocontrato.gridy = 5;
		jtfusuario.add(lblTipocontrato, gbc_lblTipocontrato);
		
		jtftipoContrato = new JTextField();
		GridBagConstraints gbc_jtftipoContrato = new GridBagConstraints();
		gbc_jtftipoContrato.insets = new Insets(0, 0, 5, 5);
		gbc_jtftipoContrato.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtftipoContrato.gridx = 1;
		gbc_jtftipoContrato.gridy = 5;
		jtfusuario.add(jtftipoContrato, gbc_jtftipoContrato);
		jtftipoContrato.setColumns(10);
		
		JButton btnseleccionarTipoContrato = new JButton("Seleccionar");
		GridBagConstraints gbc_btnseleccionarTipoContrato = new GridBagConstraints();
		gbc_btnseleccionarTipoContrato.insets = new Insets(0, 0, 5, 0);
		gbc_btnseleccionarTipoContrato.gridx = 2;
		gbc_btnseleccionarTipoContrato.gridy = 5;
		jtfusuario.add(btnseleccionarTipoContrato, gbc_btnseleccionarTipoContrato);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 6;
		jtfusuario.add(lblUsuario, gbc_lblUsuario);
		
		Jtfusuario = new JTextField();
		GridBagConstraints gbc_jtfusuario = new GridBagConstraints();
		gbc_jtfusuario.insets = new Insets(0, 0, 5, 5);
		gbc_jtfusuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfusuario.gridx = 1;
		gbc_jtfusuario.gridy = 6;
		jtfusuario.add(Jtfusuario, gbc_jtfusuario);
		Jtfusuario.setColumns(10);
		
		JButton btnSeleccionarUsuario = new JButton("Seleccionar");
		GridBagConstraints gbc_btnSeleccionarUsuario = new GridBagConstraints();
		gbc_btnSeleccionarUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionarUsuario.gridx = 2;
		gbc_btnSeleccionarUsuario.gridy = 6;
		jtfusuario.add(btnSeleccionarUsuario, gbc_btnSeleccionarUsuario);

	}

public void mostrarcontrato() {
	if(current != null) {
		this.jtfDescripcion.setText(current.getDescripcion());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.jftfecha.setText(sdf.format(current.getFechaFirma()));
		this.jtftipoContrato.setText(current.getTipocontrato().getDescripcion());
		this.jspinnerlimite.setValue(current.getLimite());
		this.jsliderSaldo.setMaximum((int)current.getLimite());
		this.jsliderSaldo.setValue((int)current.getSaldo());
		this.Jtfusuario.setText(current.getUsuario().getNombreUsuario());
	}
}
	
	private void primero() {
		current = (Contrato) ControladorContrato.getInstance().findFirst();
		mostrarcontrato();
	}
	private void ultimo() {
		current = (Contrato) ControladorContrato.getInstance().findLast();
		mostrarcontrato();
	}
	private void siguiente() {
		current = (Contrato) ControladorContrato.getInstance().findNext(current);
		mostrarcontrato();
	}
	private void anterior() {
		current =(Contrato) ControladorContrato.getInstance().findPrevious(current);
		mostrarcontrato();
	}
	
}
