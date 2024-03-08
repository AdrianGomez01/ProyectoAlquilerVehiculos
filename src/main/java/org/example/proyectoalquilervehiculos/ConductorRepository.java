package org.example.proyectoalquilervehiculos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Integer> {

    Conductor findByDni(String dni);

}
