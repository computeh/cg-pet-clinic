package guru.springframework.cgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vetindex", "/vets/vetindex.html"})
    public String listVets() {
        return "vets/vetindex";
    }
}
