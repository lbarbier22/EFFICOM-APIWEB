package fr.efficom.appweb.service;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceService {
    List<Chips> findAll();
}
