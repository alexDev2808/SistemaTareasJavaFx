package com.jath.tareas.repositorio;

import com.jath.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
