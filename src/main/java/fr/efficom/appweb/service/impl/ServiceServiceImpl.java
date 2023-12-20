package fr.efficom.appweb.service.impl;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.pojo.Note;
import fr.efficom.appweb.repository.ChipsRepository;
import fr.efficom.appweb.repository.NoteRepository;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {


    private final ChipsRepository chipsRepository;

    private final NoteRepository noteRepository;

    public ServiceServiceImpl(ChipsRepository chipsRepository, NoteRepository noteRepository) {
        this.chipsRepository = chipsRepository;
        this.noteRepository = noteRepository;
    }


    @Override
    public List<Chips> findAll() {

        return chipsRepository.findAll();
    }

    public Chips findById(Long id){
        return chipsRepository.findById(id).orElse(null);
    }

    public List<Chips> findByMarque(String marque) {
        try {
            return chipsRepository.findByMarque(marque);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Chips saveChips(Chips chips) {
        return chipsRepository.save(chips);
    }

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public Chips update(Chips chips) {
        return chipsRepository.save(chips);
    }

    public void delete(Long id) {
        chipsRepository.deleteById(id);
    }
}
