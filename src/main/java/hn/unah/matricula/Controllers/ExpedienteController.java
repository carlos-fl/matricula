package hn.unah.matricula.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.matricula.Entities.Expediente;
import hn.unah.matricula.Services.impl.ExpedienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/expediente")

public class ExpedienteController {

    @Autowired
    private ExpedienteServiceImpl expedienteServiceImpl;


    @PostMapping("/guardar")
    public Expediente GuardarExpediente(@RequestBody Expediente expediente) {
        return this.expedienteServiceImpl.CrearExpediente(expediente);
    }
    
    @GetMapping("/obtener")
    public Expediente obtenerXid(@RequestParam (name = "id") int id) {
        return this.expedienteServiceImpl.obtenerExpediente(id);
    }
    
    
}