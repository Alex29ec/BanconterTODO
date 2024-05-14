package Principal;

import javax.swing.JFrame;

import Principal.vistas.PanelPrincipal;

public class Principal extends JFrame{

	static Principal instance = null;
	PanelPrincipal pp = new PanelPrincipal();

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	

	public Principal() {
		super("Gestion de Articulo");
		this.setBounds(0,0,800,600);
		this.getContentPane().add(pp);
		
		
	}
	
	


	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
