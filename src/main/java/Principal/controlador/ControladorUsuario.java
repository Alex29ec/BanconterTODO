package Principal.controlador;

import java.util.List;

import javax.persistence.EntityManager;

import Principal.Entidades.Entidad;
import Principal.Entidades.Usuario;


public class ControladorUsuario extends Controlador {

    public ControladorUsuario(String unidadPersistencia) {
        super(Usuario.class, unidadPersistencia);
        // TODO Auto-generated constructor stub
    }

    private static ControladorUsuario instance = null;

    public static ControladorUsuario getInstance() {
        if (instance == null) {
            instance = new ControladorUsuario("PanelBankonterTodo");
        }
        return instance;
    }

    public List<? extends Entidad> findbyString(String str, String nombretabla, String campo, boolean isCaseSensitive) {
        if (isCaseSensitive) {
            try {
                EntityManager em = getEntityManagerFactory().createEntityManager();
                List<? extends Entidad> l = em
                        .createNativeQuery("select * from " + nombretabla + " where " + campo + " like '%" + str + "%'",
                                Usuario.class)
                        .getResultList();
                em.close();
                return l;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        else {
            try {
                EntityManager em = getEntityManagerFactory().createEntityManager();
                List<? extends Entidad> l = em
                        .createNativeQuery("select * from " + nombretabla + " where UPPER(" + campo + ") like '%" + str + "%'",
                                Usuario.class)
                        .getResultList();
                em.close();
                return l;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        
    }

}