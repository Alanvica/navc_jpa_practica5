package com.sistemas.bean;

import com.sistemas.entidades.Estudiante;
import com.sistemas.jpa.EstudianteJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Villalba
 */
public class BeanEstudiante {
    private EntityManagerFactory emf;
    private EstudianteJpaController jpaEstudiante;

    public BeanEstudiante() {
        emf = Persistence.createEntityManagerFactory("IUPseguimiento");
        jpaEstudiante = new EstudianteJpaController(emf);
    }

    public List<Estudiante> listarTodos() {
        return jpaEstudiante.findEstudianteEntities();
    }
    
    public void insertar(Estudiante e) {
        jpaEstudiante.create(e);
    }

    public void eliminar(Integer id) {
        jpaEstudiante.destroy(id);
    }

    public void editar(Estudiante e) {
        try {
            jpaEstudiante.edit(e);
        } catch (Exception ex) {
            Logger.getLogger(BeanEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Estudiante buscar(Integer id) {
        Estudiante e = new Estudiante();
        e = jpaEstudiante.findEstudiante(id);
        return e;
    }
}
