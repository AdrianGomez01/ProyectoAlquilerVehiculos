package org.example.proyectoalquilervehiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public class VehiculoRepository extends JpaRepository<, Long> {

}