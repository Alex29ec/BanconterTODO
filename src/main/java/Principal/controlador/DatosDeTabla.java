package Principal.controlador;

import java.util.List;

import Principal.Entidades.Tipocontrato;



public class DatosDeTabla {
	/** 
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] {"Id","Descripcion"};
	}
	/**
	 * @return
	 */
	public static Object[][] getDatosDeTabla() {
		// Obtengo todas las personas
		List<Tipocontrato> personas = (List<Tipocontrato>) ControladorTipoContrato.getInstance().findAll();
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[personas.size()][7];
		// Cargo los datos de la lista de personas en la matriz de los datos
		for (int i = 0; i < personas.size(); i++) {
			Tipocontrato persona = personas.get(i);
			datos[i][0] = persona.getId();
			datos[i][1] = persona.getDescripcion();
		}
		return datos;
	}	
}
