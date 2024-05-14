package Principal.controlador;

import Principal.Entidades.Contrato;

public class ControladorContrato extends Controlador{

	public ControladorContrato(Class entidadControlada, String unidadPersistencia) {
		super(Contrato.class, "PanelModificacionFConTODO");
		// TODO Auto-generated constructor stub
	}

	static ControladorContrato instance = null;
	
	public static ControladorContrato getInstance() {
		if (instance == null) {
			instance = new ControladorContrato(Contrato.class,"PanelModificacionFConTODO");
		}
		return instance;
	}
	

	
}
