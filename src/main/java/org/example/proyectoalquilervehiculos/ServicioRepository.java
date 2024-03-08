package org.example.proyectoalquilervehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ServicioRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void agregarKilometros(int servicioId, int kilometros) {
        String sql = "UPDATE servicios SET kilometrajeServicio = kilometrajeServicio + ? WHERE idServicio = ?";
        jdbcTemplate.update(sql, kilometros, servicioId);
    }

    public List<Conductor> conductoresEnServicio() {
        String sql = "SELECT c.* FROM servicios s JOIN conductores c ON s.idConductor = c.idConductor WHERE s.finalizado = 0";
        return jdbcTemplate.query(sql, new ConductorRowMapper());
    }

    public void registrarServicioTerminado(int servicioId) {
        String sql = "UPDATE servicios SET finalizado = 1 WHERE idServicio = ?";
        jdbcTemplate.update(sql, servicioId);
    }

}
