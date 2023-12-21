package fr.efficom.appweb.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "chips")
public class Chips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String marque;

    @OneToOne
    @JoinColumn(name = "id_note", referencedColumnName = "id")
    private Note note;

    @ManyToOne
    @JoinColumn(name = "id_prix", referencedColumnName = "id")
    private Prix prix;

    @ManyToOne
    @JoinColumn(name = "id_reduction", referencedColumnName = "id")
    private Reductions reduction;

}
