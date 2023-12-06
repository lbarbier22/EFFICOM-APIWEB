package fr.efficom.appweb.service;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ServiceService {

    Chips getChipsByID(Long id);

    List<Chips> findAll();
}
