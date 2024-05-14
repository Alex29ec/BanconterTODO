package Principal.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Principal.Entidades.Tipocontrato;



public class ControladorTipoContrato {
	
	private static EntityManager em =  Persistence.createEntityManagerFactory("Banco").createEntityManager();
	static String nombreTabla = "tipocontrato";
	
	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public static List<Tipocontrato> findAll() {
		
		return (List<Tipocontrato>) em.createNativeQuery("SELECT * FROM " + nombreTabla, Tipocontrato.class)
				.getResultList();
	}

}
