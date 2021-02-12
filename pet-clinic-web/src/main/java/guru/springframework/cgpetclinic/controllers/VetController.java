package guru.springframework.cgpetclinic.controllers;

import guru.springframework.cgpetclinic.services.VeterinaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VeterinaryService veterinaryService;

    public VetController(VeterinaryService veterinaryService) {
        this.veterinaryService = veterinaryService;
    }

    @RequestMapping({"/vets", "/vets/vetindex", "/vets/vetindex.html", "/vets.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", veterinaryService.findAll());

        return "vets/vetindex";
    }
}
