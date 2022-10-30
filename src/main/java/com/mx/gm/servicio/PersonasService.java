package com.mx.gm.servicio;

import com.mx.gm.domain.Persona;
import java.util.List;

/**
 *
 * @author Alexander
 */
public interface PersonasService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
    
}
