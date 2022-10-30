package com.mx.gm.servicio;

import com.mx.gm.dao.PersonaDao;
import com.mx.gm.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexander
 */

@Service
public class PersonasServiceImpl implements PersonasService{

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
        
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        // -- en caso de no encontrar el valor encontrado devuelve un valor nulo
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
