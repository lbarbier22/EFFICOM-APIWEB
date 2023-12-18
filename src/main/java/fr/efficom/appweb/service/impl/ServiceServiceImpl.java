package fr.efficom.appweb.service.impl;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.repository.ChipsRepository;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {


    private final ChipsRepository chipsRepository;

    public ServiceServiceImpl(ChipsRepository chipsRepository) {
        this.chipsRepository = chipsRepository;
    }


    @Override
    public List<Chips> findAll() {

        return chipsRepository.findAll();
    }

    public Chips findById(Long id){
        return chipsRepository.findById(id).orElse(null);
    }

    public Chips save(Chips chips){
        return chipsRepository.save(chips);
    }

    public void deleteById(Long id){
        chipsRepository.deleteById(id);
    }
}
