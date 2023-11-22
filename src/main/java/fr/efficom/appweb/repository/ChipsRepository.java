package fr.efficom.appweb.repository;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsRepository extends JpaRepository<Chips, String> {

}
