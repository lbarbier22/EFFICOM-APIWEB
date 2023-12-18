package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Chips findById(@PathVariable("id") Long id){
        return serviceService.findById(id);
    }

    @GetMapping("/")
    @ResponseBody
    public List<Chips> findByMarque(@RequestParam(name = "marque")String marque) {
        return serviceService.findByMarque(marque);
    }

}
