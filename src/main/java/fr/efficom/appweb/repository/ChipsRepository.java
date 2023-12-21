package fr.efficom.appweb.repository;

import fr.efficom.appweb.pojo.Chips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChipsRepository extends JpaRepository<Chips, Long> {


    @Query("select u from Chips u where u.marque = ?1")
    List<Chips> findByMarque(String marque);
}
