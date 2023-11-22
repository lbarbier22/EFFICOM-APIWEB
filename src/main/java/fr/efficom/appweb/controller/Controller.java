package fr.efficom.appweb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class Controller {

    @GetMapping
    public String bonjour(){
        return "bonjour";
    }
}
