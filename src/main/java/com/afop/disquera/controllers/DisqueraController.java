package com.afop.disquera.controllers;

import com.afop.disquera.model.Disquera;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/disquera")
public class DisqueraController {

    private List<Disquera> disqueras = new ArrayList<>();

    // Constructor: Inicializa la lista de disqueras con algunos datos de ejemplo
    public DisqueraController() {
        disqueras.add(new Disquera(1, "123456789", "Disquera A", "1234567890", "Dirección A", true));
        disqueras.add(new Disquera(2, "987654321", "Disquera B", "0987654321", "Dirección B", true));
        disqueras.add(new Disquera(3, "543216789", "Disquera C", "5678912345", "Dirección C", false));
    }

    // Handler para mostrar la lista de disqueras
    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("disqueras", disqueras);
        return "disquera/listar";
    }

    // Handler para ver los detalles de una disquera específica
    @GetMapping("/ver/{id}")
    public String ver(@PathVariable int id, Model model) {
        Disquera disquera = disqueras.stream().filter(d -> d.getIdDisquera() == id).findFirst().orElse(null);
        model.addAttribute("disquera", disquera);
        return "disquera/ver";
    }

    // Handler para mostrar el formulario de registro de una nueva disquera
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("disquera", new Disquera());
        return "disquera/form";
    }

    // Handler para procesar la solicitud de registro de una nueva disquera
    @PostMapping("/add")
    public String add(@ModelAttribute Disquera disquera, Model model) {
        // Aquí iría la lógica para guardar la nueva disquera en la base de datos
        disqueras.add(disquera); // Agregamos la nueva disquera a la lista (simulando la base de datos)
        model.addAttribute("disquera", disquera);
        return "disquera/ver";
    }
}
