package fr.efficom.appweb.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double reproductionGout;

    private Double originalite;

    private Double addictivite;

    private Double ressenti;

    private Double bonus;

    private Double note;

}
