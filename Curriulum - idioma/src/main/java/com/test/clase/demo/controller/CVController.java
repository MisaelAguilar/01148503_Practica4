package com.test.clase.demo.controller;

import com.test.clase.demo.model.CurriculumVitae;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class CVController {
    @GetMapping("/datos")
    public String obtenerDatos(Model model){
        CurriculumVitae vitae = new CurriculumVitae("Misael", "Aguilar", "Macias",
                "Nin", "Con","Eg",
                "/images/IMG_2786.JPG");

        // PRIMER ATRIBUTO NOMBRE DEL DOCUMENTO HTML
        // SEGUNDO ATRIBUTO ES EL NOMBRE DEL OBJETO CREADO ARRIBA
        model.addAttribute("Index", vitae);
        return "Index";
    }
}
