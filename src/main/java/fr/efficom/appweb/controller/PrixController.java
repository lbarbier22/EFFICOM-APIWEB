package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Note;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
origins = "*")
@RequestMapping("/api")
public class PrixController {

    private final ServiceService serviceService;

    public PrixController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

}
