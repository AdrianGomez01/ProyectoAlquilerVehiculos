package org.example.proyectoalquilervehiculos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

    List<Servicios> findAll();

    List<Servicios> findByEstado(String estado);


    List<Servicios> findByConductor(String conductor);



}
