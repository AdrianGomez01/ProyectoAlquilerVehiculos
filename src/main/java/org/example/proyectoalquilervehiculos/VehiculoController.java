package org.example.proyectoalquilervehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @PostMapping
    public ResponseEntity<Vehiculo> agregarVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo nuevoVehiculo = vehiculoRepository.save(vehiculo);
        return new ResponseEntity<>(nuevoVehiculo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> actualizarVehiculo(@PathVariable("id") int id, @RequestBody Vehiculo vehiculo) {
        if (!vehiculoRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        vehiculo.setIdVehiculo(id);
        Vehiculo vehiculoActualizado = vehiculoRepository.save(vehiculo);
        return new ResponseEntity<>(vehiculoActualizado, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Vehiculo>> obtenerTodosLosVehiculos() {
        List<Vehiculo> vehiculos = vehiculoRepository.findAll();
        return new ResponseEntity<>(vehiculos, HttpStatus.OK);
    }

}

