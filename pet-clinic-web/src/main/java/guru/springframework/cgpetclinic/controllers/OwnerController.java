package guru.springframework.cgpetclinic.controllers;

import guru.springframework.cgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    // No need for @Autowired
    // This is a constructor-type Spring Implementation
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/ownerindex", "/owners/ownerindex.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/ownerindex";
    }

    @RequestMapping({"/owners/find", "/find"})
    public String findOwners() {

        return "notimplemented";
    }
}
