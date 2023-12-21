package fr.efficom.appweb.controller;

import fr.efficom.appweb.pojo.Note;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
origins = "*")
@RequestMapping("/api")
public class NoteController {

    private final ServiceService serviceService;

    public NoteController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping(value = "/save/note")
    public Note saveNote(@RequestBody Note note) {
        return serviceService.saveNote(note);
    }

}
