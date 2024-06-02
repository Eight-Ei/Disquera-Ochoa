package com.afop.disquera.controllers;

import com.afop.disquera.model.Genero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/genero")
public class GeneroController {

    private List<Genero> generos = new ArrayList<>();

    // Constructor: Inicializa la lista de géneros con algunos datos de ejemplo
    public GeneroController() {
        generos.add(new Genero(1, "Rock", true));
        generos.add(new Genero(2, "Pop", true));
        generos.add(new Genero(3, "Jazz", true));
    }

    // Handler para mostrar la lista de géneros
    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("generos", generos);
        return "genero/listar";
    }

    // Handler para ver los detalles de un género específico
    @GetMapping("/ver/{id}")
    public String ver(@PathVariable int id, Model model) {
        Genero genero = generos.stream().filter(g -> g.getIdGenero() == id).findFirst().orElse(null);
        model.addAttribute("genero", genero);
        return "genero/ver";
    }

    // Handler para mostrar el formulario de registro de un nuevo género
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("genero", new Genero());
        return "genero/form";
    }

    // Handler para procesar la solicitud de registro de un nuevo género
    @PostMapping("/add")
    public String add(@ModelAttribute Genero genero, Model model) {
        // Aquí iría la lógica para guardar el nuevo género en la base de datos
        generos.add(genero); // Agregamos el nuevo género a la lista (simulando la base de datos)
        model.addAttribute("genero", genero);
        return "genero/ver";
    }
}
