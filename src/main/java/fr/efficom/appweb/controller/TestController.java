package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.repository.ChipsRepository;
import fr.efficom.appweb.service.ServiceService;
import fr.efficom.appweb.service.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping("/chips")
    List<Chips> findAll() {
        return serviceService.findAll();
    }

//    @GetMapping("/chips/{id}")
//    Chips one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }

//    @GetMapping
//    public String bonjour(){
//        return "bonjour";
//    }
}
