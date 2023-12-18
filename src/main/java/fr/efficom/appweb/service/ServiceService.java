package fr.efficom.appweb.service;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceService {
    List<Chips> findAll();

    Chips findById(Long id);

    List<Chips> findByMarque(String marque);

    Chips save(Chips chips);

    Chips update(Chips chips);

    void delete(Long id);

}
