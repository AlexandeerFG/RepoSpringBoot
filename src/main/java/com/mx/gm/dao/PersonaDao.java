package com.mx.gm.dao;

import com.mx.gm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alexander
 */
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
