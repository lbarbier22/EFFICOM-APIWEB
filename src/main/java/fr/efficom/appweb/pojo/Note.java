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
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "note", cascade = CascadeType.ALL)
    private Chips chips;

    private Integer reproductionGout;

    private Integer originalite;

    private Integer addictivite;

    private Integer ressenti;

    private Integer bonus;

    private Integer note;

}
