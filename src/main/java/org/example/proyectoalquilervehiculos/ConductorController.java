package org.example.proyectoalquilervehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ConductorController {

    @Autowired
    private ConductorRepository conductorRepository;

    @GetMapping("/conductores/")
    public List<Conductor> allConductores() {
        return conductorRepository.findAll();
    }

    @GetMapping("/conductores/{dni}")
    public Conductor conductorByDni(@PathVariable String dni) {
        return conductorRepository.findByDni(dni);
    }

    @PostMapping("/conductores/add")
    public Conductor newConductor(@RequestBody Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    @PostMapping("/conductores/update/{dni}")
    public Conductor conductorByDni(@RequestBody String dni, String nombre, String ap1, String ap2, String tipoCarnet, int anyosCarnet) {
        Conductor conductor = conductorRepository.findByDni(dni);
        conductor.setNombre(nombre);
        conductor.setAp1(ap1);
        conductor.setAp2(ap2);
        conductor.setTipoCarnet(tipoCarnet);
        conductor.setAniosCarnet(anyosCarnet);
        return  conductorRepository.save(conductor);
    }


}
