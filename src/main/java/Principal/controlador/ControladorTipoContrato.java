package Principal.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Principal.Entidades.Contrato;
import Principal.Entidades.Tipocontrato;



public class ControladorTipoContrato extends Controlador{
	
	public ControladorTipoContrato(Class entidadControlada, String unidadPersistencia) {
		super(entidadControlada, unidadPersistencia);
		// TODO Auto-generated constructor stub
	}

	private static EntityManager em =  Persistence.createEntityManagerFactory("PanelModificacionFConTODO").createEntityManager();
	static String nombreTabla = "tipocontrato";
	
	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
static ControladorTipoContrato instance = null;
	
	public static ControladorTipoContrato getInstance() {
		if (instance == null) {
			instance = new ControladorTipoContrato(Contrato.class,"PanelModificacionFConTODO");
		}
		return instance;
	}
	
	public List<Tipocontrato> findAll() {
		
		return (List<Tipocontrato>) em.createNativeQuery("SELECT * FROM " + nombreTabla, Tipocontrato.class)
				.getResultList();
	}

}
