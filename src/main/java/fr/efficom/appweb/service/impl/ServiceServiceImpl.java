package fr.efficom.appweb.service.impl;

import fr.efficom.appweb.pojo.Chips;
import fr.efficom.appweb.repository.ChipsRepository;
import fr.efficom.appweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ChipsRepository chipsRepository;

    @Override
    public Chips getChipsByID(String id) {
        return chipsRepository.findById(id).orElse(null);
    }

    public void saveChips(Chips chips){
        chipsRepository.save(chips);
    }
}
