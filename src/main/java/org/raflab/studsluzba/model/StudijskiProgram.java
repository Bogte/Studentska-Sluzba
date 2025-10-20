package org.raflab.studsluzba.model;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class StudijskiProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String oznaka; //RN, RI
    private String naziv;
    private Integer godinaAkreditacije;
    private String zvanje;
    private Integer trajanjeGodina;
    private Integer trajanjeSemestra;
    private String vrstaStucija;
    private Integer ukupnoEspb;

    @JsonIgnore
    @OneToMany(mappedBy = "studProgram")
    private List<Predmet> predmeti;
}
