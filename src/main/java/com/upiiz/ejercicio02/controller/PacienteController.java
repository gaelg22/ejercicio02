package com.upiiz.ejercicio02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    @GetMapping
    public String listar() {
        return "pacientes";
    }

    @GetMapping("/agregar")
    public String agregar() {
        return "agregar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id) {
        return "editar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        return "eliminar";
    }
}
