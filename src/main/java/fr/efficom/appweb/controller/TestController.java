package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.pojo.Note;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
origins = "*")
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

    @GetMapping(value = "/{id}")
    public Chips findById(@PathVariable("id") Long id){
        return serviceService.findById(id);
    }

    //http://localhost:8022/api/?marque=Brets
    @GetMapping(value = "/")
    @ResponseBody
    public List<Chips> findByMarque(@RequestParam(name = "marque")String marque) {
        return serviceService.findByMarque(marque);
    }

    @PostMapping(value = "/save/chips")
    public Chips saveChips(@RequestBody Chips chips) {
        return serviceService.saveChips(chips);
    }

    @PostMapping(value = "/save/note")
    public Note saveNote(@RequestBody Note note) {
        return serviceService.saveNote(note);
    }

    @PutMapping(value = "/update/{id}")
    public Chips update(@PathVariable("id") Long id, @RequestBody Chips chips) {
        return serviceService.update(chips);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        serviceService.delete(id);
    }

}
