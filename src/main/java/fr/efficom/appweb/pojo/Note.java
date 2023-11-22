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
    private String id;

    private int reproductionGout;

    private int originalite;

    private int addictivite;

    private int ressenti;

    private int bonus;

    private int note;

}
