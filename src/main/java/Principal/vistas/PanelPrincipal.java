package Principal.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JButton;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField jtftipoContrato;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
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
		gbc_lblGestionContrato.insets = new Insets(0, 0, 5, 5);
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		jtfusuario.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 2;
		jtfusuario.add(lblFecha, gbc_lblFecha);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.gridwidth = 2;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 2;
		jtfusuario.add(formattedTextField, gbc_formattedTextField);
		
		JLabel lblNewLabel = new JLabel("Limite:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		jtfusuario.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner jspinnerlimite = new JSpinner();
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
		
		JSlider jsliderSaldo = new JSlider();
		GridBagConstraints gbc_jsliderSaldo = new GridBagConstraints();
		gbc_jsliderSaldo.gridwidth = 2;
		gbc_jsliderSaldo.insets = new Insets(0, 0, 5, 0);
		gbc_jsliderSaldo.gridx = 1;
		gbc_jsliderSaldo.gridy = 4;
		jtfusuario.add(jsliderSaldo, gbc_jsliderSaldo);
		
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
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 6;
		jtfusuario.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnSeleccionarUsuario = new JButton("Seleccionar");
		GridBagConstraints gbc_btnSeleccionarUsuario = new GridBagConstraints();
		gbc_btnSeleccionarUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionarUsuario.gridx = 2;
		gbc_btnSeleccionarUsuario.gridy = 6;
		jtfusuario.add(btnSeleccionarUsuario, gbc_btnSeleccionarUsuario);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 3;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 7;
		jtfusuario.add(btnGuardar, gbc_btnGuardar);

	}

}
