package fr.efficom.appweb.repository;

import fr.efficom.appweb.pojo.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, String> {

}
