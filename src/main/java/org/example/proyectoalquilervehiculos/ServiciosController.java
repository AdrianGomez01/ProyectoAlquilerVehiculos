package org.example.proyectoalquilervehiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ServiciosController {

    @Autowired
    private ServiciosRepository serviciosRepository;

    @GetMapping("/servicios/")
    public List<Servicios> allServices(){return serviciosRepository.findAll();}



}
