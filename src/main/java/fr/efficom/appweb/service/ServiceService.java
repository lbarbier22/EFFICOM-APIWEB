package fr.efficom.appweb.service;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.pojo.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceService {
    List<Chips> findAll();

    Chips findById(Long id);

    List<Chips> findByMarque(String marque);

    Chips saveChips(Chips chips);

    Note saveNote(Note note);

    Chips update(Chips chips);

    void delete(Long id);

}
