package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final ServiceService serviceService;

    public TestController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<Chips> findAll(){
        return serviceService.findAll();
    }

}
