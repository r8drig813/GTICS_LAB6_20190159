package com.example.lab6_20190159.Controllers;

import com.example.lab6_20190159.entities.Site;
import com.example.lab6_20190159.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/sitios")
public class SitiosController {

     final SiteRepository siteRepository;


    public SitiosController(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;

    }


    @GetMapping(value = {"/lista"})
    public String lista(Model model){

        model.addAttribute("listaSitios", siteRepository.findAll());

        return "Sitios/lista";
    }

    @GetMapping("/new")
    public String crear() {
        return "Sitios/newform";
    }


    @PostMapping("/guardar")
    public String guardar(Site site) {

        siteRepository.save(site);

        return "redirect:/sitios/lista";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Site> optional = siteRepository.findById(id);

        if (optional.isPresent()) {
            siteRepository.deleteById(id);
        }

        return "redirect:/sitios/lista";
    }

    @GetMapping("/editar")
    public String formEditar(@RequestParam("id") int id, Model model) {

        Optional<Site> optional = siteRepository.findById(id);

        if(optional.isPresent()){ //existe un shipper con ese ID
            Site sitio = optional.get();
            model.addAttribute("sitio",sitio);
            return "Sitios/editform";
        }else{
            return "redirect:/sitios/lista";
        }
    }



}
