package org.example.proyectoalquilervehiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

    List<Vehiculo> findByTipo(String tipo);


    Vehiculo findByMatricula(String matricula);
}
