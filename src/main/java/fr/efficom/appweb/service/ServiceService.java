package fr.efficom.appweb.service;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.beans.factory.annotation.Autowired;

public interface ServiceService {

    Chips getChipsByID(String id);
}
