package Principal.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import Principal.Entidades.Contrato;

public class Controlador {
	private static EntityManager em =  Persistence.createEntityManagerFactory("PanelModificacionFConTODO").createEntityManager();

	private static String nombreTabla = "contrato";

		public static void findAll() {
			System.out.println(em.createNativeQuery("SELECT * FROM " + nombreTabla, Contrato.class)
					.getResultList());
		}
	
	
	
}
