package fr.efficom.appweb.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer reproductionGout;

    private Integer originalite;

    private Integer addictivite;

    private Integer ressenti;

    private Integer bonus;

    private Integer note;

}
